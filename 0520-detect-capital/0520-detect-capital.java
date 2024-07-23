class Solution {
    public boolean detectCapitalUse(String word) {
        if(Character.isLowerCase(word.charAt(0)))
            return isSmall(word);
        if(word.length() >= 2 && Character.isUpperCase(word.charAt(0)) && Character.isLowerCase(word.charAt(1)))
            return firstCapital(word);
        return isCapital(word);
    }

    public boolean isSmall(String word){
        for(char c: word.toCharArray()){
            if(Character.isUpperCase(c))
                return false;
        }

        return true;
    }

    public boolean isCapital(String word){
        for(char c: word.toCharArray()){
            if(Character.isLowerCase(c))
                return false;
        }

        return true;
    }

    public boolean firstCapital(String word){
        for(int i = 1; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i)))
                return false;
        }
        return true;
    }
}