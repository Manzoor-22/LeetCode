class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb1 = new StringBuilder();

        for(int i = s.length()-1; i >= 0; i--){
            char curr = s.charAt(i);
            if(Character.isLetterOrDigit(curr)){
                sb1.append(Character.toLowerCase(curr));
            }
        }

        StringBuilder sb2 = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(Character.isLetterOrDigit(curr)){
                sb2.append(Character.toLowerCase(curr));
            }
        }

        return sb1.toString().equals(sb2.toString());
    }
}