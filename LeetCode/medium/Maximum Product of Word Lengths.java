class Solution {
    public int maxProduct(String[] words) {
        int max = 0;
        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                
                if(check(words[i], words[j])){
                    
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }
    
    public static boolean check(String s1, String s2){
        HashSet<Character> on = new HashSet<>();
        
        for(int i = 0; i < s1.length(); i++){
            
            on.add(s1.charAt(i));
        }
        
        for(int j = 0; j < s2.length(); j++){
            if(on.contains(s2.charAt(j))){
                return false;
            }
        }
        return true;
    }
}
