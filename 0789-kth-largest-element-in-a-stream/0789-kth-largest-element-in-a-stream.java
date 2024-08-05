class KthLargest {
    ArrayList<Integer> al = new ArrayList<>();
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;

        for(int i : nums){
            al.add(i);
        }
    }
    
    public int add(int val) {
        al.add(val);
        Collections.sort(al);

        return al.get(al.size() - k);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */