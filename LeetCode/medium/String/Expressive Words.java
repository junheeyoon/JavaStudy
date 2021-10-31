class Solution {
    public int expressiveWords(String s, String[] words) {
        int c = 0;
        for(String word: words){
            if(is(s, word))c++;
        }
        
        return c;
    }
    
    private boolean is(String s, String w){
        int i=0;
        int j=0;
        
        while(i < s.length() && j < w.length()){
            if(s.charAt(i) == w.charAt(j)){
                int sc = 1;
                int wc = 1;
                
                while(i+1 < s.length() && s.charAt(i) == s.charAt(i+1)){
                    sc++;
                    i++;
                }
                while(j+1 < w.length() && w.charAt(j) == w.charAt(j+1)){
                    wc++;
                    j++;
                }   
                if(wc > sc || (sc != wc && sc <= 2)) return false;
                i++;
                j++;
            }else{
                return false;
            }
        }
        
        return i == s.length() && j == w.length();
    }
}
