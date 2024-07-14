class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(Integer n: nums){
            if(hs.contains(n)){
                hs.remove(n);
            } else{
                hs.add(n);
            }
        }
        int[] ans = new int[2];
        int i = 0;
        for(Integer n: hs){
            ans[i++] = n;
        }
        return ans;
    }
}