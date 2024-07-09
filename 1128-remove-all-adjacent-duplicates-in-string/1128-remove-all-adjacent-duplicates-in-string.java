class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder(" ");
        for(int i = 0; i < s.length();i++){
            int j = sb.length()-1;
            if(sb.charAt(j) == s.charAt(i))
                sb.delete(j,j+1);
            else
                sb.append(s.charAt(i));
        }
        return sb.toString().trim();
    }
}