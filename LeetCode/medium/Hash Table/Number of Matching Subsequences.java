class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        
        int result = 0;
        Set<String> set = new HashSet<>();
        Set<String> cashe = new HashSet<>();
        
        for(int i = 0 ; i < words.length; i++){
            int index = 0;
            if(set.contains(words[i])){
                
            }
            else if(cashe.contains(words[i])){
                result++;
            }
            else{
                for(int j = 0; j < s.length(); j++){
                    if(index < words[i].length() && words[i].charAt(index) == s.charAt(j)){
                        index++;
                    }
                    if(index >= words[i].length()){
                        break;
                    }
                }
                if(index == words[i].length()){
                    cashe.add(words[i]);
                    result++;
                }
                else{
                    set.add(words[i]);
                }    
            }
            
        }
        
        return result;
    }
}

