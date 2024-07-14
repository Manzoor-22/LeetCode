class Solution {
    public String getSmallestString(String s) {
        char[] c = s.toCharArray();

        for(int i = 1; i < s.length(); i++){
            int num1 = c[i-1]-'0';
            int num2 = c[i]-'0';

            if((num1%2) == (num2%2) && num1 > num2){
                char temp = c[i-1];
                c[i-1] = c[i];
                c[i] = temp;
                break;
            }
        }

        return new String(c);
    }
}