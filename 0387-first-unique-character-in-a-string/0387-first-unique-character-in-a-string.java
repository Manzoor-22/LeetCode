class Solution {
    public int firstUniqChar(String s) {
        int[] chars = new int[26];

        //storing 0's in chars
        for(int i = 0; i < chars.length; i++)
            chars[i] = 0;

        for(char c : s.toCharArray()){
            chars[c-'a'] += 1;
        }
        for(int i = 0; i < s.length(); i++){
            if(chars[s.charAt(i) -'a'] == 1)
                return i;
        }

        return -1;
    }
}