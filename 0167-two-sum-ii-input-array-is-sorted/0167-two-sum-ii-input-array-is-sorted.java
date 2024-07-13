class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int first = 0, second = numbers.length-1;
        int[] ans = {0,0};
        while(first < second){
            if(numbers[first]+numbers[second] == target){
                ans[0] = first+1;
                ans[1] = second+1;
                break;
            }
            else if(numbers[first]+numbers[second] > target){
                second--;
            }
            else{
                first++;
            }
        }

        return ans;
    }
}