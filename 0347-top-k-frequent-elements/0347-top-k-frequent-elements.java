class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        TreeMap<Integer, Integer> hm = new TreeMap<>();
        int[] ans = new int[k];

        for(int i : nums){
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }else{
                hm.put(i, 1);
            }
        }

        int t = k;
        int a = 0;
        while(t-- > 0){
            int highest = Integer.MIN_VALUE;
            int key = 0;
            for(Map.Entry<Integer, Integer> itr: hm.entrySet()){
                if(highest < itr.getValue()){
                    highest = itr.getValue();
                    key = itr.getKey();
                }
            }
            hm.remove(key);
            ans[a++] = key;
        }
        
        return ans;
    }
}