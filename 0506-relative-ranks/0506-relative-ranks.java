class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer, String> hm = new HashMap<>();
        String[] ans = new String[score.length];
        
        int[] sorted = Arrays.copyOf(score, score.length);
        Arrays.sort(sorted);

        for(int i = 0; i < score.length; i++){
            if(i == score.length-1){
                hm.put(sorted[i], "Gold Medal");
            }
            else if(i == score.length-2){
                hm.put(sorted[i], "Silver Medal");
            }
            else if(i == score.length-3){
                hm.put(sorted[i], "Bronze Medal");
            }
            else{
                hm.put(sorted[i], Integer.toString(sorted.length - i));
            }
        }

        for(int i = 0; i < ans.length; i++){
            ans[i] = hm.get(score[i]);
        }

        return ans;
    }
}