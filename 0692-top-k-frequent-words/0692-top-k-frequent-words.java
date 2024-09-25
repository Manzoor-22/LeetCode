class Solution {
    static class Info implements Comparable<Info>{
        String str;
        int freq;

        public Info(int freq, String str){
            this.freq = freq;
            this.str = str;
        }

        @Override
        public int compareTo(Info s1){
            if(s1.freq == this.freq){
                return this.str.compareTo(s1.str);
            }
            return s1.freq-this.freq;
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            if(!hm.containsKey(words[i])){
                hm.put(words[i], 1);
            } else{
                hm.put(words[i], hm.get(words[i])+1);
            }
        }

        PriorityQueue<Info> pq = new PriorityQueue<>();
        for(Map.Entry<String, Integer> itr : hm.entrySet()){
            pq.add(new Info(itr.getValue(), itr.getKey()));
        }

        List<String> ans = new ArrayList<>();
        for(int i = 0; i < k; i++){
            ans.add(pq.poll().str);
        }

        return ans;
    }
}