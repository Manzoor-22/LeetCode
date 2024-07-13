class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int area = 0;

        while(left < right){
            int minHeight = Math.min(height[left], height[right]);
            int currentArea = (right - left) * minHeight;
            area = Math.max(area, currentArea);

            while(left < right && height[left] <= minHeight){
                left++;
            } 
            while(right > left && height[right] <= minHeight){
                right--;
            }
        }

        return area;
    }
}