class Solution {
    public int minOperations(String s) {
        int slowest = 0;

        for(char c : s.toCharArray()){
            int curr = (26 - (c - 'a')) % 26;
            slowest = Math.max(curr, slowest);
        }

        return slowest;
    }
}