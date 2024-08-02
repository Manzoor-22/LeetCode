class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(char c : s.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<Character>((a,b) -> hm.get(b)-hm.get(a));
        pq.addAll(hm.keySet());

        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty()){
            char removed = pq.remove();

            for(int i = 0; i < hm.get(removed); i++)
                sb.append(removed);
        }

        return sb.toString();
    }
}