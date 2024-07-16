class Solution {
    static int sol = 0;
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        int max = total/cost1;
        long ans = 0;

        for(int i = 0; i <= max; i++){
            int pdt1 = total - (i * cost1);
            ans = ans + (pdt1/cost2) + 1;
        }
        return ans;
    }
}