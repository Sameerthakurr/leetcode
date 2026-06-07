class Solution {
    public int passThePillow(int n, int time) {
        int cycle = n - 1;
        int r = time % cycle;
        int q = time / cycle;

        return q % 2 == 0 ? r + 1 : n - r;
    }
}