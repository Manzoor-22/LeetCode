class AllOne {
    Map<String, Integer> hm;
    TreeSet<Pair<Integer, String>> set;

    public AllOne() {
        hm = new HashMap<>();
        set = new TreeSet<>((a,b) -> a.getKey().equals(b.getKey()) ? a.getValue().compareTo(b.getValue()) : a.getKey()-b.getKey());
    }
    
    public void inc(String key) {
        int n = hm.getOrDefault(key, 0);
        hm.put(key, n+1);
        set.remove(new Pair<>(n, key));
        set.add(new Pair<>(n+1, key));
    }
    
    public void dec(String key) {
        int n = hm.get(key);
        set.remove(new Pair<>(n, key));
        if(n == 1){
            hm.remove(key);
        }
        else{
            hm.put(key, n-1);
            set.add(new Pair<>(n-1, key));
        }
    }
    
    public String getMaxKey() {
        return set.isEmpty() ? "" : set.last().getValue();
    }
    
    public String getMinKey() {
        return set.isEmpty() ? "" : set.first().getValue();
    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */