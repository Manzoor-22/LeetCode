class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Integer> stk = new Stack<>();
        int[] lastIdx = new int[26];

        for(int i = 0; i < s.length(); i++){
            lastIdx[s.charAt(i) - 'a'] = i;
        }

        boolean[] seen = new boolean[26];

        for(int i = 0; i < s.length(); i++){
            int curr = s.charAt(i)- 'a';
            if(seen[curr]){
                continue;
            }
            while(!stk.isEmpty() && stk.peek() > curr && i < lastIdx[stk.peek()]){
                seen[stk.pop()] = false;
            }
            stk.push(curr);
            seen[curr] = true;
        }

        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append((char)(stk.pop()+'a'));
        }

        return sb.reverse().toString();
    }
}