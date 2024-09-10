class Solution {
    public String convertDateToBinary(String date) {
        int year = 0;
        int month = 0;
        int din = 0;

        for(int i = 0; i < 4; i++){
            year = (year * 10) + Character.getNumericValue(date.charAt(i));
        }

        for(int i = 5; i < 7; i++){
            month = (month * 10) + Character.getNumericValue(date.charAt(i));
        }

        for(int i = 8; i < date.length(); i++){
            din = (din * 10) + Character.getNumericValue(date.charAt(i));
        }

        StringBuilder ans = new StringBuilder();
        ans.append(Integer.toBinaryString(year));
        ans.append("-");
        ans.append(Integer.toBinaryString(month));
        ans.append("-");
        ans.append(Integer.toBinaryString(din));

        return ans.toString();
    }
}