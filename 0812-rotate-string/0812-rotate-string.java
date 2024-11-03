class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(goal);

        if(s.length() != goal.length()){
            return false;
        }

        if(s.equals(goal)){
            return true;
        }

        for(int i = 0; i < s.length(); i++){
            char last = sb.charAt(sb.length()-1);
            sb.deleteCharAt(sb.length()-1);
            sb.insert(0, last);

            if(sb.toString().equals(s)){
                return true;
            }
        }

        return false;
    }
}