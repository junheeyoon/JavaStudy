class Solution {
    public String reorganizeString(String s) {
        int[] count = new int[26];
        int max = 0;
        char maxChar = s.charAt(0);
        
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a'] += 1;
            if(max < count[s.charAt(i) - 'a']){
                max = count[s.charAt(i) - 'a'];
                maxChar = s.charAt(i);
            }
        }
        if(max > (s.length()+1)/2) return "";
        
        char[] res = new char[s.length()];
        int index=0;
        
        while(count[maxChar - 'a'] > 0){
            res[index] = maxChar;
            count[maxChar - 'a'] -= 1;
            index += 2;
        }
        
        for(int i = 0; i < 26; i++){
            while(count[i] > 0){
                if(index >= s.length()){
                    index = 1;
                }
                res[index] = (char)(i + 'a');
                index += 2;
                count[i] -= 1;
            }
        }
        
        return String.valueOf(res);
    }
}
