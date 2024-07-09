class Solution {
    public int lengthLongestPath(String input) {
        Deque<Integer> s = new ArrayDeque<>();
        s.push(0);
        int ans = 0;

        for(String str : input.split("\n")){
            int level = str.lastIndexOf("\t") + 1;

            while(level + 1 < s.size()){
                s.pop();
            }

            int len = s.peek() + str.length() - level + 1;
            s.push(len);

            if(str.contains("."))
                ans = Math.max(ans, len-1);
        }

        return ans;
    }
}