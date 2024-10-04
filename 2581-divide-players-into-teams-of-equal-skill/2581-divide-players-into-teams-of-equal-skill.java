class Solution {
    public long dividePlayers(int[] skill) {
        long sum = 0, ans = 0;
        int n = skill.length;
        
        Arrays.sort(skill);

        long maxSkill = skill[0] + skill[n-1];

        for(int i = 0; i < n/2; i++){
            if(skill[i] + skill[n-i-1] != maxSkill){
                return -1;
            }
            ans += skill[i] * skill[n-i-1];
        }

        return ans;
    }
}