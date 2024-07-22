class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, String> ht = new TreeMap<>();

        for(int i = 0; i < names.length; i++){
            ht.put(heights[i], names[i]);
        }

        String[] ans = new String[names.length];
        int i = heights.length-1;
        for(Map.Entry<Integer, String> itr : ht.entrySet()){
            ans[i] = itr.getValue();
            i--;
        }

        return ans;
    }
}