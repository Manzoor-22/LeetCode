class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk = new Stack<>();
        int ans = 0;

        for(int i = 0; i < s.length(); i++){
            if(!stk.isEmpty() && s.charAt(i) == ')' && stk.peek() == '('){
                stk.pop();
            }
            else{
                stk.push(s.charAt(i));
            }
        }

        return stk.size();
    }
}