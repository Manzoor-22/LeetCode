class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int ans[] = new int[n];

        for(int i = 0; i < n; i++){
            int curr = 0;
            for(int j = 0; j < n; j++){
                if(i == j){
                    continue;
                }
                if(boxes.charAt(j) == '1'){
                    curr += Math.abs(i-j);
                }
            }
            ans[i] = curr;
        }

        return ans;
    }
}