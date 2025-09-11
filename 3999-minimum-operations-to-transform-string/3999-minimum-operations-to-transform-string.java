class Solution {
    public int minOperations(String s) {
        int ans = 0;

        // Single Character
        if(s.length() == 1){
            if(s.charAt(0) == 'a'){
                return 0;
            }

            return 26 - (s.charAt(0)-'a');
        }

        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);

        for(int i = 0; i < charArray.length-1; i++){
            if(charArray[i] != 'a' && charArray[i] != charArray[i+1]){
                ans += charArray[i+1]-charArray[i];
            }
        }

        // Last char was left in the upper loop, calculating for last char
        if(charArray[charArray.length-1] != 'a'){
            ans += 26 - (charArray[charArray.length-1] - 'a');
        }

        return ans;
    }
}