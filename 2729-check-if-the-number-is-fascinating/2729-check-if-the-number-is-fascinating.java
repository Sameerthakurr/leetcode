class Solution {
    public boolean isFascinating(int n) {
        String s = "" + n + (2 * n) + (3 * n);

        if (s.length() != 9) return false;

        boolean[] seen = new boolean[10];

        for (char c : s.toCharArray()) {
            int d = c - '0';

            if (d == 0 || seen[d]) return false;
            seen[d] = true;
        }

        return true;
    }
}