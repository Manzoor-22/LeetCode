class MinStack {
    int top = -1;
    ArrayList<Integer> al;
    public MinStack() {
        al = new ArrayList<>();
    }
    public void push(int val) {
        al.add(0, val);
        top++;
    }
    
    public void pop() {
        al.remove(0);
    }
    
    public int top() {
        return al.get(0);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < al.size(); i++){
            if(min > al.get(i))
                min = al.get(i);
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */