class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(Integer n : target){
            hm.put(n, hm.getOrDefault(n, 0)+1);
        }

        for(Integer n : arr){
            if(!hm.containsKey(n)){
                return false;
            }
            else if(hm.get(n) == 0){
                return false;
            }
            hm.put(n, hm.get(n)-1);
        }   

        return true;
    }
}