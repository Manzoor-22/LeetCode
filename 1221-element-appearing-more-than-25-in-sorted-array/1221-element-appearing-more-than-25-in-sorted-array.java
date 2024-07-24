class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer, Integer> hm = new HashMap<>();

        for(int num : arr){
            if(hm.containsKey(num)){
                hm.put(num, hm.get(num)+1);
            } else {
                hm.put(num, 1);
            }
        }

        int n = arr.length;

        for(Map.Entry<Integer, Integer> itr : hm.entrySet()){
            if(itr.getValue() > n/4){
                return itr.getKey();
            }
        }

        return -1;
    }
}