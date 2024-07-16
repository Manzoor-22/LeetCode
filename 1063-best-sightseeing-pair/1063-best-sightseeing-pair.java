class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int ans = values[0];
        int prevBestIdx = 0;

        for(int i = 1; i < values.length; i++){
            ans = Math.max(ans, values[prevBestIdx]+prevBestIdx+values[i]-i);
            if(values[prevBestIdx] + prevBestIdx < values[i] + i){
                prevBestIdx = i;
            }
        }

        return ans;
    }
}