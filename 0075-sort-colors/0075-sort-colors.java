class Solution {
    public void sortColors(int[] nums) {
        int countof1 = 0, countof2 = 0, countof0 = 0;

        for(int element : nums){
            if(element == 0){
                countof0++;
            } else if(element == 1){
                countof1++;
            } else {
                countof2++;
            }
        }

        for(int i = 0; i < countof0; i++){
            nums[i] = 0;
        }

        int next = (countof0 + countof1);

        for(int i = countof0; i < next; i++){
            nums[i] = 1;
        }

        for(int i = next; i < nums.length; i++){
            nums[i] = 2;
        }
    }
}