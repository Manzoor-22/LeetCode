class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        // 40 10 20 30
        // 10 20 30 40

        int[] sorted = Arrays.stream(arr).distinct().sorted().toArray();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < sorted.length; i++){
            hm.put(sorted[i], i+1);
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = hm.get(arr[i]);
        }

        return arr;
    }
}