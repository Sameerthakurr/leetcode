class Solution {
    public String[] findWords(String[] words) {

        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";

        List<String> ans = new ArrayList<>();

        for (String w : words) {

            String s = w.toLowerCase();

            String row = r1;
            if (r2.indexOf(s.charAt(0)) != -1) row = r2;
            else if (r3.indexOf(s.charAt(0)) != -1) row = r3;

            boolean ok = true;

            for (char c : s.toCharArray()) {
                if (row.indexOf(c) == -1) {
                    ok = false;
                    break;
                }
            }

            if (ok) ans.add(w);
        }

        return ans.toArray(new String[0]);
    }
}