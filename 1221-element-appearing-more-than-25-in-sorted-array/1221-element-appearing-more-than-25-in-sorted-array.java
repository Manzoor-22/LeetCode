class Solution {
    public int findSpecialInteger(int[] arr) {
        if(arr.length/4 < 0){
            return arr[0];
        }

        int currCount = 0;
        int currElement = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(currElement == arr[i]){
                currCount++;
            }
            if(currCount > arr.length/4){
                return arr[i];
            }
            if(currElement != arr[i]){
                currCount = 1;
                currElement = arr[i];
            }
        }

        return -1;
    }
}