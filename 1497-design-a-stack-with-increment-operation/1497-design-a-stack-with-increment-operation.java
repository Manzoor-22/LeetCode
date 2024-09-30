class CustomStack {
    List<Integer> ll;
    final int size;

    public CustomStack(int maxSize) {
        ll = new LinkedList<>();
        size = maxSize;
    }
    
    public void push(int x) {
        if(ll.size() < size)
            ll.addLast(x);
    }
    
    public int pop() {
        return ll.isEmpty() ? -1 : ll.removeLast();
    }
    
    public void increment(int k, int val) {
        for(int i = 0; i < k && i < ll.size(); i++){
            ll.set(i, ll.get(i) + val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */