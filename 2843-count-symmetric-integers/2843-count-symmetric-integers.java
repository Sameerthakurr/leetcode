class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int i = low; i <= high; i++) {
            String s = String.valueOf(i);

            if (s.length() % 2 == 1) continue;

            int a = 0, b = 0, n = s.length() / 2;

            for (int j = 0; j < n; j++) {
                a += s.charAt(j) - '0';
                b += s.charAt(j + n) - '0';
            }

            if (a == b) count++;
        }

        return count;
    }
}