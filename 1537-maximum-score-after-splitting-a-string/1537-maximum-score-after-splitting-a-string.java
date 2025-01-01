class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int[] leftZ = new int[s.length()];
        leftZ[0] = s.charAt(0) == '0' ? 1 : 0;
        for(int i = 1; i < leftZ.length; i++){
            if(s.charAt(i) == '0'){
                leftZ[i] = 1 + leftZ[i-1];
            }
            else{
                leftZ[i] = leftZ[i-1];
            }
        }

        int[] rightZ = new int[s.length()];
        rightZ[n-1] = s.charAt(n-1) == '1' ? 1 : 0;
        for(int i = n-2; i >= 0; i--){
            if(s.charAt(i) == '1'){
                rightZ[i] = 1 + rightZ[i+1];
            }
            else{
                rightZ[i] = rightZ[i+1];
            }
        }

        int ans = 0;

        for(int i = 1; i < n; i++){
            ans = Math.max(ans, leftZ[i-1]+rightZ[i]);
        }

        return ans;
    }
}