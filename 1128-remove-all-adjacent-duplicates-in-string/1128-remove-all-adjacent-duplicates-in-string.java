class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(!stk.isEmpty() && stk.peek() == s.charAt(i)){
                stk.pop();
                continue;
            }
            stk.push(s.charAt(i));
        }

        String ans = "", sol = "";
        while(!stk.isEmpty())
        ans += stk.pop();

        for(int i = ans.length()-1; i >= 0; i--){
            sol += ans.charAt(i);
        }

        return sol;
    }
}