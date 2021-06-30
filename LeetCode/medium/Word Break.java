class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        boolean[] check = new boolean[s.length()+1];
        check[0] = true;
        for(int i = 1; i < s.length() + 1; i++){
            for(String str: wordDict){
                
                if(i < str.length()){
                    continue;
                }
                if(check[i-str.length()] && s.substring(i-str.length(),i).equals(str)){
                    check[i] = true;
                }
            }    
        }
        return check[s.length()];
    }
}
