class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        Arrays.fill(c1, 0);
        Arrays.fill(c2, 0);

        for(char c : magazine.toCharArray()){
            c1[c-'a'] += 1;
        }
        for(char c : ransomNote.toCharArray()){
            c2[c-'a'] += 1;
        }

        for(int i = 0; i < c1.length; i++){
            if(c1[i] < c2[i]){
                return false;
            }
        }
        return true;
    }
}