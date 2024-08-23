class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int carry = 0;

        int i = a.length()-1, j = b.length()-1;
        
        while(i >= 0 && j >= 0){
            char first = a.charAt(i);
            char sec = b.charAt(j);
            if(first == '0' && sec == '0'){
                ans.append(carry);
                carry = 0;
            }
            else if(first == '1' && sec == '0'){
                if(carry == 0){
                    ans.append("1");
                } else{
                    ans.append("0");
                    carry = 1;
                }
            }
            else if(first == '0' && sec == '1'){
                if(carry == 0){
                    ans.append("1");
                } else{
                    ans.append("0");
                    carry = 1;
                }
            }
            else {
                if(carry == 0){
                    ans.append("0");
                    carry = 1;
                } else{
                    ans.append("1");
                    carry = 1;
                }
            }
            i--;
            j--;
        }

        while(i >= 0){
            int first = a.charAt(i);
            if(carry == 0 && first == '1'){
                ans.append("1");
            } 
            else if(carry == 0 && first =='0'){
                ans.append("0");
            }
            else if(carry == 1 && first == '1'){
                ans.append("0");
                carry = 1;
            }
            else if(carry == 1 && first == '0'){
                ans.append("1");
                carry = 0;
            }
            i--;
        }

        while(j >= 0){
            int first = b.charAt(j);
            if(carry == 0 && first == '1'){
                ans.append("1");
            } 
            else if(carry == 0 && first =='0'){
                ans.append("0");
            }
            else if(carry == 1 && first == '1'){
                ans.append("0");
                carry = 1;
            }
            else if(carry == 1 && first == '0'){
                ans.append("1");
                carry = 0;
            }
            j--;
        }
        if(carry == 1){
            ans.append(carry);
        }

        return ans.reverse().toString();
    }
}