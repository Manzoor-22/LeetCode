class Solution {
    class Info implements Comparable<Info>{
        int idx;
        int num;

        public Info(int idx, int num){
            this.idx = idx;
            this.num = num;
        }

        @Override
        public int compareTo(Info i2){
            return i2.num - this.num;
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Info> pq = new PriorityQueue<>();
        int n = nums.length;
        int[] ans = new int[n-k+1];

        for(int i = 0; i < k; i++){
            pq.add(new Info(i, nums[i]));
        }

        ans[0] = pq.peek().num;
        int j = 1;
        for(int i = k; i < n; i++){
            while(pq.size() > 0 && pq.peek().idx <= (i-k)){
                pq.poll();
            }
            pq.add(new Info(i, nums[i]));
            ans[j++] = pq.peek().num;
        }

        return ans;
    }
}