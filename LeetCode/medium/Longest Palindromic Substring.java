class Solution {
    
    String answer = "";
    public String longestPalindrome(String s) {
        
        for(int i = 0; i < s.length(); i++){
            check(s, i, i);
            check(s, i, i+1);    
        }
        return answer;
    }
    public void check(String s, int i, int j){
        
        if(i < 0){
            return;
        }
        if(j >= s.length()){
            return;
        }
        if(s.charAt(i) == s.charAt(j)){
            if(answer.length() < (j - i + 1)){
                answer = s.substring(i, j+1);
            }
            check(s, i-1, j+1);
        }
        
        return;
    }
    
}
