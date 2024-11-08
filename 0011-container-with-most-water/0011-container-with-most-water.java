class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int ans = 0;

        while(left < right){
            int currArea = Math.min(height[left], height[right]);
            currArea *= (right-left);

            ans = Math.max(ans, currArea);

            if(height[left] <= height[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return ans;
    }
}