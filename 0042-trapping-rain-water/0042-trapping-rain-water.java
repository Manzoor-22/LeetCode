class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int[] leftH = new int[n];
        leftH[0] = height[0];

        int[] rightH = new int[n];
        rightH[n-1] = height[n-1];

        for(int i = 1; i < n; i++){
            leftH[i] = Math.max(height[i], leftH[i-1]);
        }

        for(int i = n-2; i >= 0; i--){
            rightH[i] = Math.max(height[i], rightH[i+1]);
        }

        int ans = 0;

        for(int i = 0; i < n; i++){
            ans += Math.min(leftH[i], rightH[i]) - height[i];
        }

        return ans;
    }
}