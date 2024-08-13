class Solution {
    class Info implements Comparable<Info>{
        int[] points;
        int distance;

        public Info(int[] points, int distance){
            this.points = points;
            this.distance = distance;
        }

        @Override
        public int compareTo(Info i){
            return this.distance - i.distance;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Info> pq = new PriorityQueue<>();

        for(int i = 0; i < points.length; i++){
            int x = points[i][0];
            int y = points[i][1];

            int distance = (x*x) + (y*y);
            pq.add(new Info(new int[]{x,y}, distance));
        }

        int[][] ans = new int[k][2];
        for(int i = 0; i < k; i++){
            Info removed = pq.remove();
            ans[i][0] = removed.points[0];
            ans[i][1] = removed.points[1];
        }

        return ans;
    }
}