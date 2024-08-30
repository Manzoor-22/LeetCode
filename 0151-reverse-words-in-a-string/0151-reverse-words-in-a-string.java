class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String curr = "";

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                if(curr.length() >= 1){
                    ans.insert(0, " " + curr);
                }
                curr = "";
            }
            else{
                curr += s.charAt(i);
            }
        }
        ans.insert(0, curr);
        
        while(ans.charAt(0) == ' '){
            ans.deleteCharAt(0);
        }

        return ans.toString();
    }
}