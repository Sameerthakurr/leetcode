class Solution {

    HashMap<Integer, Integer> map = new HashMap<>();

    public int[] findMode(TreeNode root) {

        dfs(root);

        int max = 0;

        for (int v : map.values()) {
            max = Math.max(max, v);
        }

        List<Integer> ans = new ArrayList<>();

        for (int k : map.keySet()) {
            if (map.get(k) == max) {
                ans.add(k);
            }
        }

        int[] res = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }

    void dfs(TreeNode root) {

        if (root == null) return;

        map.put(root.val, map.getOrDefault(root.val, 0) + 1);

        dfs(root.left);
        dfs(root.right);
    }
}