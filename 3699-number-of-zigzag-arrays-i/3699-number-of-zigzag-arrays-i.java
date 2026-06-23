class Solution {
    private int MOD = 1000000007;
    public int zigZagArrays(int n, int l, int r) {
        int m = r-l+1;
        int arr[] = new int[m];
        Arrays.fill(arr, 1);

        for(int i = 2; i <= n; i++){
            if(i % 2 == 0){
                // forward pass
                int prev = 0;
                for(int j = 0; j < m; j++){
                    int k = arr[j];
                    arr[j] = prev;
                    prev = (prev + k) % MOD;
                }
            }
            else{
                // backward pass
                int prev = 0;
                for(int j = m-1; j >= 0; j--){
                    int k = arr[j];
                    arr[j] = prev;
                    prev = (prev + k) % MOD;
                }
            }
        }

        int ans = 0;
        for(int a : arr){
            ans = (ans + a) % MOD;
        }

        return (ans*2)%MOD;
    }
}