class Solution {
    public String removeStars(String s) {
        StringBuilder ans = new StringBuilder();
        int stars = 0;
        
        for(int i = s.length()-1; i >= 0; i--){
            char c = s.charAt(i);
            if(c == '*'){
                stars++;
            } else{
                if(stars > 0){
                    stars--;
                } else{
                    ans.insert(0, c);
                }
            }
        }

        return ans.toString();
    }
}