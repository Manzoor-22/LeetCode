class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int xMin = arrays.get(0).get(0);
        int size = arrays.get(0).size();
        int xMax = arrays.get(0).get(size-1);
        int diff = 0;

        for(int i = 1; i < arrays.size(); i++){
            List<Integer> arr = arrays.get(i);
            int min = arr.get(0);
            int n = arr.size();
            int max = arr.get(n-1);

            diff = Math.max(diff, Math.max(Math.abs(xMin-max), Math.abs(xMax-min)));
            xMin = Math.min(xMin, min);
            xMax = Math.max(xMax, max);
        }

        return diff;
    }
}