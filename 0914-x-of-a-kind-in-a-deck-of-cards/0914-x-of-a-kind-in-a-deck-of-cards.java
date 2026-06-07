class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] cnt = new int[10000];

        for (int x : deck) cnt[x]++;

        int g = 0;

        for (int c : cnt) {
            if (c > 0) {
                g = gcd(g, c);
            }
        }

        return g > 1;
    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}