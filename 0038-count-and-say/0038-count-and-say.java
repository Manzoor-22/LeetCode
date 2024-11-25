class Solution {
    public String countAndSay(int n) {
        String ans = getSol(n);

        return ans;
    }

    public String getSol(int n){
        if(n == 1){
            return "1";
        }

        String RLE = getSol(n-1);
        StringBuilder ans = new StringBuilder();
        int count = 1;
        for(int i = 0; i < RLE.length()-1; i++){
            if(RLE.charAt(i) != RLE.charAt(i+1)){
                ans.append(count);
                ans.append(RLE.charAt(i));
                count = 1;
            } else{
                count++;
            }
        }

        ans.append(count);
        ans.append(RLE.charAt(RLE.length()-1));

        return ans.toString();
    }
}