class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int ans = 0;
        long sum = 0;

        HashSet<Integer> hs = new HashSet<>();
        for(int i : banned){
            hs.add(i);
        }

        for(int i = 1; i <= n; i++){
            if(!hs.contains(i)){
                if(sum + i > maxSum){
                    return ans;
                }
                sum += i;
                ans++;
            }
        }

        return ans;
    }
}