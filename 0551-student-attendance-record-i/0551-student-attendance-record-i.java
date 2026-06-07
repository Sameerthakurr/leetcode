class Solution {
    public boolean checkRecord(String s) {

        int a = 0;
        int l = 0;

        for (char c : s.toCharArray()) {

            if (c == 'A') {
                a++;
                l = 0;
            }
            else if (c == 'L') {
                l++;
            }
            else {
                l = 0;
            }

            if (a >= 2 || l >= 3)
                return false;
        }

        return true;
    }
}