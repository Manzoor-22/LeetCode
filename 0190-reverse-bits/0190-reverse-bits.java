public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int answer = 0;

        for(int i = 0; i < 32; i++){
            int last = (n & 1);
            answer = (answer << 1) | last;
            n = n >> 1;
        }

        return answer;
    }
}