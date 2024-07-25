class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String first = strs[0];
        String second = strs[strs.length-1];

        StringBuilder ans = new StringBuilder("");
        int i = 0;

        while(i < first.length() && i < second.length()){
            if(first.charAt(i) == second.charAt(i)){
                ans.append(first.charAt(i));
                i++;
            } else{
                break;
            }
        }

        return ans.toString();
    }
}