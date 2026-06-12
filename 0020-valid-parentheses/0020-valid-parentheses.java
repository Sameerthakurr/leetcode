class Solution {
    public boolean isValid(String s) {
       Stack<Character> st = new Stack<>();
        int n = s.length();
        if(n%2 != 0){
            return false;
        }
        if(n<=1){
            return false;
        }
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                else if(checkBracket(st.peek() ,ch)){
                    st.pop();
                }
                else{
                    return false;
                }

            }
        }
        return(st.size() == 0);

    }
    public static boolean checkBracket(char c, char d){
        if(c == '{' && d == '}') return true;
        if(c == '(' && d == ')') return true;
        if(c == '[' && d == ']') return true;
        return false;
    }
}