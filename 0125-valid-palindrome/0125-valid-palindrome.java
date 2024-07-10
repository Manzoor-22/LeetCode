class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder("");

        for(char c : s.toCharArray()){
            if(Character.isAlphabetic(c)){
                sb.append(Character.toUpperCase(c));
            } if(Character.isDigit(c)){
                sb.append(c);
            }
        }

        int i = 0, j = sb.length()-1;

        while(i < j){
            if(sb.charAt(i) != sb.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
}