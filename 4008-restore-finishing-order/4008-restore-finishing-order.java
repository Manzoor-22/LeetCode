class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> hs = new HashSet<>();

        for(int a : friends){
            hs.add(a);
        }

        int ans[] = new int[friends.length];
        int i = 0;
        for(int a : order){
            if(hs.contains(a)){
                ans[i++] = a;
            }
        }

        return ans;
    }
}