class Solution {
    public boolean lemonadeChange(int[] bills) {
        int countOf5 = 0;
        int countOf10 = 0;
        int countOf20 = 0;

        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                countOf5++;
            }
            else if(bills[i] == 10){
                if(countOf5 == 0){
                    return false;
                }
                countOf10++;
                countOf5--;
            }
            else{
                int curr = (countOf5*5)+(countOf10*10);
                if(curr < 15 || countOf5 == 0){
                    return false;
                }
                if(countOf10 >= 1 && countOf5 >= 1){
                    countOf10--;
                    countOf5--;
                }
                else if(countOf5 >= 3){
                    countOf5 = countOf5 - 3;
                }
            }
        }

        return true;
    }
}