class Solution {
    String[] nums = {
        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if(digits.length() == 0){
            return ans;
        }
        
        backtrack(ans, new StringBuilder(), digits, 0);

        return ans;
    }

    public void backtrack(List<String> ans, StringBuilder curr, String digits, int idx){
        if(idx == digits.length()){
            ans.add(curr.toString());
            return;
        }

        int digit = digits.charAt(idx) - '0';
        String letters = nums[digit];

        for(char letter : letters.toCharArray()){
            curr.append(letter);
            backtrack(ans, curr, digits, idx+1);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}