class Solution {
    public boolean isSubsequence(String s, String t) {
        int lastIdx = 0;
        for(int i = 0; i < s.length(); i++){
            int first = s.charAt(i);
            boolean isFound = false;
            for(int j = lastIdx; j < t.length(); j++){
                if(first == t.charAt(j)){
                    isFound = true;
                    lastIdx = j+1;
                    break;
                }
            }

            if(!isFound){
                return false;
            }
        }

        return true;
    }
}