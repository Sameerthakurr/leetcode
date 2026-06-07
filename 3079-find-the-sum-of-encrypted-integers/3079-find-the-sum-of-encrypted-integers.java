class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;

        for (int x : nums) {
            int max = 0, len = 0, t = x;

            while (t > 0) {
                max = Math.max(max, t % 10);
                len++;
                t /= 10;
            }

            int enc = 0;
            for (int i = 0; i < len; i++) {
                enc = enc * 10 + max;
            }

            sum += enc;
        }

        return sum;
    }
}