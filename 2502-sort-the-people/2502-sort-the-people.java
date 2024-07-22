class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> hm = new HashMap<>();

        for(int i = 0; i < names.length; i++){
            hm.put(heights[i], names[i]);
        }
        Arrays.sort(heights);

        String[] ans = new String[names.length];
        int k = heights.length-1;

        for(int i = 0; i < heights.length; i++){
            ans[k] = hm.get(heights[i]);
            k--;
        }

        return ans;
    }
}