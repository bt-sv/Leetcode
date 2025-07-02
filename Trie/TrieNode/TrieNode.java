public class TrieNode {
    public int val;
    public boolean isEnd;
    public TrieNode[] children;

    public TrieNode() {
        children = new TrieNode[26];
        isEnd = false;
    }

    public void insertRecursive(TrieNode root, String str, int ind) {
        if (ind == str.length()) {
            root.isEnd = true;
            return;
        }
        char c = str.charAt(ind);
        TrieNode[] arr = root.children;
        if (arr[c] == null) {
            arr[c] = new TrieNode();
        }
        root = arr[c];
        insertRecursive(root, str, ind + 1);
    }

    public void insertNonRecursive(TrieNode root, String str) {
        for (char c : str.toCharArray()) {
            TrieNode[] arr = root.children;
            if (arr[c] == null) {
                arr[c] = new TrieNode();
            }
            root = arr[c];
        }
        root.isEnd = true;
    }

    public boolean searchRecursion(TrieNode root, String str, int ind) {
        if (ind == str.length()) {
            return root.isEnd = true;
        }
        char c = str.charAt(ind);
        if (root.children[c] == null)
            return false;
        return searchRecursion(root.children[c], str, ind + 1);
    }
    
    public boolean searchNonRecursion(TrieNode root, String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (root.children[c] == null)
                return false;
            root = root.children[c];
        }
        return root.isEnd = true;
    }
}
