class Solution {
    public char processStr(String s, long k) {
        long size[] = new long[s.length()];
        long len = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '*'){
                len = (len > 1 ? len-1 : 0);
            }
            else if(c == '#'){
                len *= 2;
            }
            else if(c != '%'){
                len++;
            }
            size[i] = len;
        }

        if(len <= k){
            return '.';
        }

        for(int i = s.length()-1; i >= 0; i--){
            char c = s.charAt(i);

            switch(c){
                case '*':
                    break;
                
                case '%':
                    // reverse back
                    k = size[i]-k-1;
                    break;
                
                case '#':
                    // divide back into 2 parts
                    if(k >= (size[i]/2))
                        k = k - (size[i]/2);
                    break;

                default:
                    if(k+1 == size[i])
                        return c;
            }
        }

        return '.';
    }
}