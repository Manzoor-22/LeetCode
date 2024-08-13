class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);

        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
    public void findCombinations(int idx, int[] arr, int target, List<List<Integer>> ans, List<Integer> curr){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i = idx; i < arr.length; i++){
            if(i > idx && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i] > target){
                break;
            }
            curr.add(arr[i]);
            findCombinations(i+1, arr, target-arr[i], ans, curr);
            curr.remove(curr.size()-1);
        }
    }
}