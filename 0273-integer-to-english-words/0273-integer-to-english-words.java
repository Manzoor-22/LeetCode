class Solution {
    public String numberToWords(int num) {
        if(num == 0){
            return "Zero";
        }

        int[] values = {1000000000, 1000000, 1000, 100, 90, 80, 70, 60, 50, 40, 30, 20,19,18,17,16,15,14,13,12,11,10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        String[] words = {"Billion", "Million", "Thousand", "Hundred", "Ninety", "Eighty", "Seventy", "Sixty", "Fifty", "Forty", "Thirty", "Twenty","Nineteen","Eighteen","Seventeen", "Sixteen", "Fifteen", "Fourteen", "Thirteen", "Twelve", "Eleven", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One"};

        return convertToWords(num, values, words);
    }

    public String convertToWords(int num, int[] values, String[] words){
        String ans = "";

        for(int i = 0; i < values.length; i++){
            int value = values[i];
            String word = words[i];

            if(num >= value){
                if(num >= 100){
                    ans += convertToWords(num/value, values, words) + " ";
                }

                ans += word;

                if(num % value > 0){
                    ans += " " + convertToWords(num%value, values, words);
                }

                return ans;
            }
        }

        return ans;
    }
}