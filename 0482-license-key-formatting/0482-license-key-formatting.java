class Solution {
    public String licenseKeyFormatting(String s, int k) {

        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1, c = 0; i >= 0; i--) {

            char ch = Character.toUpperCase(s.charAt(i));

            if (ch == '-') continue;

            if (c == k) {
                sb.append('-');
                c = 0;
            }

            sb.append(ch);
            c++;
        }

        return sb.reverse().toString();
    }
}