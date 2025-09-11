class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> al = new ArrayList<>();
	    
	    //Extract all the vowels from the string
	    for(char c : s.toCharArray()){
	        if(checkVowel(c)){
	            al.add(c);
	        }
	    }
	    
	    //Sort the vowels of the string
	    Collections.sort(al);
	    
	    int k = 0;
        StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < s.length(); i++){
            if(checkVowel(s.charAt(i))){
                sb.append(al.get(k++));
            } else{
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public static boolean checkVowel(char c){
	    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A'|| c == 'E' || c == 'I' || c == 'O' || c == 'U';
	}
}