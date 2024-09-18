class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> ans = new HashSet<>();

        for(int i = 1; i <= nums.length; i++){
            ans.add(i);
        }

        for(int i = 0; i < nums.length; i++){
            ans.remove(nums[i]);
        }

        List<Integer> res = new LinkedList<>();
        for(Integer i : ans){
            res.add(i);
        }

        return res;
    }
}