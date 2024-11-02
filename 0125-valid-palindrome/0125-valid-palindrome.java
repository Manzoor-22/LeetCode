class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        remove(0, sb1, s);
        getReverse(s.length()-1, sb2, s);

        return sb1.toString().equals(sb2.toString());
    }

    public void getReverse(int i, StringBuilder ans, String s){
        if(i < 0){
            return;
        }

        char curr = s.charAt(i);

        if(Character.isLetterOrDigit(curr)){
            ans.append(Character.toLowerCase(curr));
        }

        getReverse(--i, ans, s);
    }

    public void remove(int i, StringBuilder ans, String s){
        if(i == s.length()){
            return;
        }

        char curr = s.charAt(i);

        if(Character.isLetterOrDigit(curr)){
            ans.append(Character.toLowerCase(curr));
        }

        remove(++i, ans, s);
    }
}