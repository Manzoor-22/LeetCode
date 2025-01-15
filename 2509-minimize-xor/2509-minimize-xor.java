class Solution {
    public int minimizeXor(int num1, int num2) {
        int sb1 = countSetBits(num1);
        int sb2 = countSetBits(num2);

        if(sb1 == sb2){
            return num1;
        }
        else if(sb1 < sb2){
            return addSetBits(num1, sb2-sb1);
        }

        return removeSetBits(num1, sb1-sb2);
    }

    private int countSetBits(int n){
        int ans = 0;

        while(n != 0){
            ans += n & 1;
            n = n >> 1;
        }

        return ans;
    }

    private int addSetBits(int n, int count){
        int bp = 0;
        while(count > 0){
            while((n >> bp & 1) == 1) bp++;
            n |= 1 << bp;
            count--;
        }
        return n;
    }

    private int removeSetBits(int num, int bitsToRemove) {
        while (bitsToRemove > 0) {
            num &= (num - 1);
            bitsToRemove--;
        }
        return num;
    }
}