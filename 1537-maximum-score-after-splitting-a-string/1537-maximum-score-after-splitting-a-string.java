class Solution {
    public int maxScore(String s) {
        int leftZ = 0;
        int rightO = 0;
        int n = s.length();

        leftZ = s.charAt(0) == '0' ? 1 : 0;

        for(int i = n-1; i >= 1; i--){
            if(s.charAt(i) == '1'){
                rightO++;
            }
        }

        int ans = 0;
        ans = Math.max(ans, leftZ+rightO);

        for(int i = 1; i < n-1; i++){

            if(s.charAt(i) == '0'){
                leftZ++;
            } else{
                rightO--;
            }
            ans = Math.max(ans, leftZ+rightO);
        }

        return ans;
    }
}