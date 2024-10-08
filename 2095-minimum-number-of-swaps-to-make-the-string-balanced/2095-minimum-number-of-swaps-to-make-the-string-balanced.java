class Solution {
    public int minSwaps(String s) {
        int ans = 0;

        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);

            if(s.charAt(i) == '[')
                ans++;

            else if(ans > 0)
                ans--;
        }

        return (ans+1)/2;
    }
}