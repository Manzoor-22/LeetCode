class Solution {
    public boolean isBalanced(String num) {
        long evenSum = 0;
        long oddSum = 0;

        for(int i = 0; i < num.length(); i++){
            if(i % 2 == 0)
                evenSum += Character.getNumericValue(num.charAt(i));
            else
                oddSum += Character.getNumericValue(num.charAt(i));
        }

        return evenSum == oddSum;
    }
}