class Solution {
    public String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (String w : words) {
            ans.append(new StringBuilder(w).reverse()).append(" ");
        }

        return ans.toString().trim();
    }
}