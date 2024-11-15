class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        int n = intervals.length;
        ArrayList<int[]> al = new ArrayList<>();
        int[] prev = new int[2];

        for(int i = 0; i < n; i++){
            int[] curr = intervals[i];
            int size = al.size();
            if(size == 0 || prev[1] < intervals[i][0]){
                al.add(curr);
                prev[0] = intervals[i][0];
                prev[1] = intervals[i][1];
            } else{
                prev[1] = Math.max(prev[1], intervals[i][1]);
                al.set(size-1, new int[]{prev[0], prev[1]});
            }
        }

        return al.toArray(new int[al.size()][2]);
    }
}