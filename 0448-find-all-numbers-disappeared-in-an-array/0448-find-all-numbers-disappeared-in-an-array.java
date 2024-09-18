class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] ans = new boolean[nums.length+1];
        Arrays.fill(ans, false);
        ans[0] = true;

        for(int i = 0; i < nums.length; i++){
            ans[nums[i]] = true;
        }

        List<Integer> res = new LinkedList<>();
        for(int i=0; i < ans.length; i++){
            if(ans[i] == false)
                res.add(i);
        }

        return res;
    }
}