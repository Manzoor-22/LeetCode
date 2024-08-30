class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 1){
            return true;
        }

        int i = 0, j = s.length()-1;

        while(i <= j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            else {
                char first = Character.toUpperCase(s.charAt(i));
                char second = Character.toUpperCase(s.charAt(j));

                if(first != second){
                    return false;
                }

                i++;
                j--;
            }
        }

        return true;
    }
}