class Solution { 
    public int maximumGain(String s, int x, int y) {
        int top_score, bot_score, score = 0;
        String top, bot;

        if(x > y){
            top_score = x;
            bot_score = y;
            top = "ab";
            bot = "ba";
        }  else{
            top_score = y;
            bot_score = x;
            top = "ba";
            bot = "ab";
        }

        StringBuilder sb = new StringBuilder("");
        for(char c : s.toCharArray()){
            if(sb.length() > 0 && sb.charAt(sb.length()-1) == top.charAt(0) && c == top.charAt(1)){
                sb.delete(sb.length()-1, sb.length());
                score += top_score;
            } else{
                sb.append(c);
            }
        }
        
        StringBuilder s2 = new StringBuilder();
        for(char c : sb.toString().toCharArray()){
            if(s2.length() > 0 && s2.charAt(s2.length()-1) == bot.charAt(0) && c == bot.charAt(1)){
                score += bot_score;
                s2.delete(s2.length()-1, s2.length());
            } else{
                s2.append(c);
            }
        }

        return score;
    }
}