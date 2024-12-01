class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> hs = new HashSet<>();

        for(int a : arr){
            if(a % 2 == 0){
                if(hs.contains(a*2) || hs.contains(a/2)){
                    return true;
                }
            } else{
                if(hs.contains(a*2)){
                    return true;
                }
            }
            hs.add(a);
        }

        return false;
    }
}