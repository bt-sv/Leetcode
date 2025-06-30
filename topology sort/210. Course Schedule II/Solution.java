class Solution {
    Map<Integer, List<Integer>> g = new HashMap<>();
    int[] state, ans;
    int pos = 0;
    boolean dfs(int x) {
        state[x] = 1;
        for (int y : g.get(x))
            if (state[y] == 1)
                return false;
            else if (state[y] == 0)
                if (!dfs(y))
                    return false;
        state[x] = 2;
        ans[pos++] = x;
        return true;
    }
    public int[] findOrder(int n, int[][] pre) {
        for (int i = 0; i < n; i++)
            g.put(i, new LinkedList<>());
        for (int[] p : pre)
            g.get(p[0]).add(p[1]);
        state = new int[n];
        ans = new int[n];
        for (int i = 0; i < n; i++)
            if (state[i] == 0 && !dfs(i))
               return new int[0];
        return ans;
    }
}
