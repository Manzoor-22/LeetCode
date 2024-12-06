class Solution {
    class Info implements Comparable<Info>{
        String key;
        int val;

        public Info(String key, int val){
            this.key = key;
            this.val = val;
        }

        @Override
        public int compareTo(Info s){
            if(s.val == this.val)
                return this.key.compareTo(s.key);

            return s.val - this.val;
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> hm = new HashMap<>();
        for(String s : words){
            hm.put(s, hm.getOrDefault(s, 0)+1);
        }

        List<String> ans = new ArrayList<>();
        PriorityQueue<Info> pq = new PriorityQueue<>();

        for(Map.Entry<String, Integer> itr : hm.entrySet()){
            pq.add(new Info(itr.getKey(), itr.getValue()));
        }

        for(int i = 1; i <= k; i++){
            ans.add(pq.poll().key);
        }

        return ans;
    }
}