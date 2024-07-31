class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < target.length; i++){
            hm.put(target[i], hm.getOrDefault(target[i], 0)+1);
        }

        for(int i = 0; i < arr.length; i++){
            if(!hm.containsKey(arr[i]) || hm.get(arr[i]) <= 0)
                return false;
            hm.replace(arr[i], hm.get(arr[i])-1);
        }

        return true;
    }
}