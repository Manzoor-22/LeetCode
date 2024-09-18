class Solution {
    public String largestNumber(int[] nums) {
        String[] array = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            array[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(array, (a,b) -> (b+a).compareTo(a+b));
        if(array[0].equals("0")){
            return "0";
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < nums.length; i++){
            ans.append(array[i]);
        }

        return ans.toString();
    }
}