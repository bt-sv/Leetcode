Class Solution {
    List<Integer> list = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();
    int[] candidates;
    int target;
    
    public void dfs(int p, int k) {
        if (k > target)
            return;
        if (k == target) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = p; i < candidates.length; i++) {
            if (i != p && candidates[i] == candidates[i - 1])
                continue;
            list.add(candidates[i]);
            dfs(i + 1, k + candidates[i]_);
            list.remove(list.size() - 1);
        }
     }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.candidates = candidates;
        this.target = target;
        Arrays.sort(candidates);
        dfs(0, 0);
        return res;
    }
}
