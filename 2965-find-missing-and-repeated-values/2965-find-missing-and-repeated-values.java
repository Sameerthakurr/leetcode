class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] cnt = new int[n * n + 1];
        int repeat = 0, missing = 0;

        for (int[] row : grid) {
            for (int x : row) {
                cnt[x]++;
            }
        }

        for (int i = 1; i <= n * n; i++) {
            if (cnt[i] == 2) repeat = i;
            if (cnt[i] == 0) missing = i;
        }

        return new int[]{repeat, missing};
    }
}