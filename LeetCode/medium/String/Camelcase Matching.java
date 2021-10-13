class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> result = new ArrayList<>();
        
        for(String query: queries){
            result.add(match(query, pattern));
        }
        
        return result;
    }
    
    public Boolean match(String query, String pattern){
        
        int index = 0;
        
        for(char c: query.toCharArray()){
            
            if(index < pattern.length() && pattern.charAt(index) == c){
                index++;
            }
            else if(Character.isUpperCase(c)){
                return false;
            }
        }
        
        return pattern.length() == index;
    }
}
