class Solution {
    class Info implements Comparable<Info>{
        int number;
        int soldiers;
        public Info(int number, int soldiers){
            this.number = number;
            this.soldiers = soldiers;
        }

        @Override
        public int compareTo(Info a1){
            if(this.soldiers == a1.soldiers){
                return this.number-a1.number;
            }
            return this.soldiers-a1.soldiers;
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Info> pq = new PriorityQueue<>();

        for(int i = 0; i < mat.length; i++){
            int soldiers = 0;
            int j = 0;
            while(j < mat[0].length && mat[i][j] != 0){
                soldiers++;
                j++;
            }
            pq.add(new Info(i, j));
        }
        int[] ans = new int[k];
        for(int i = 0 ; i < k; i++){
            ans[i] = pq.poll().number;
        }

        return ans;
    }
}