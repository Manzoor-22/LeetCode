class Solution {
    public int maxBuilding(int num, int[][] restrictions) {
        List<int[]> al = new ArrayList<>(Arrays.asList(restrictions));
        al.add(new int[]{1,0});
        al.sort((a, b) -> Integer.compare(a[0], b[0]));
        int n = al.size();

        for(int i = 1; i < n; i++){
            al.get(i)[1] = yCap(al.get(i-1), al.get(i));
        }

        for(int i = n-2; i >= 0; i--){
            al.get(i)[1] = yCap(al.get(i+1), al.get(i));
        }

        int ans = 0;
        for(int i = 1; i < n; i++){
            ans = Math.max(ans, yPeak(al.get(i-1), al.get(i)));
        }

        return Math.max(ans, al.get(n-1)[1]+num-al.get(n-1)[0]);
    }

    int yCap(int[] prev, int[] curr){
        return Math.min(curr[1], prev[1]+Math.abs(curr[0]-prev[0]));
    }

    int yPeak(int[] prev, int[] curr){
        return(prev[1]+curr[1]+curr[0]-prev[0]) >> 1;
    }
}