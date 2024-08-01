class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for(int i = 0; i < details.length; i++){
            int tens = Character.getNumericValue(details[i].charAt(11));
            int ones = Character.getNumericValue(details[i].charAt(12));
            int age = (tens * 10) + ones;
            if(age > 60)
                count++;
        }

        return count;
    }
}