class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++){
            ArrayList<Integer> al = new ArrayList<>();
            int a = i+1, b = nums.length-1;
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            while(a < b){
                if(nums[i] + nums[a] + nums[b] == 0){
                    ans.add(Arrays.asList(nums[i], nums[a], nums[b]));

                    while(a < b && nums[a] == nums[a + 1])
                        a++;

                    while(b < a && nums[b] == nums[b - 1])
                        b--;

                    a++;
                    b--;
                } else if(nums[i] + nums[a] + nums[b] >= 0){
                    b--;
                } else{
                    a++;
                }
            }
        }   
        return ans;
    }
}