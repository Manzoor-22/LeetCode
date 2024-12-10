class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        
        HashMap<String, List<String>> hm = new HashMap<>();

        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            if(hm.containsKey(sorted)){
                hm.get(sorted).add(s);
            } else{
                ArrayList<String> al = new ArrayList<>();
                al.add(s);
                hm.put(sorted, al);
            }
        }

        for(Map.Entry<String, List<String>> itr : hm.entrySet()){
            ans.add(itr.getValue());
        }

        return ans;
    }
}