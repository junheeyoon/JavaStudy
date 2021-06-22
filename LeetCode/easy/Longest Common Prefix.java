class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        String result = "";
        for(int i = 0; i < s.length(); i++){
            for(int j = 1; j < strs.length; j++){
                if(strs[j].length()-1 < i || s.charAt(i) != strs[j].charAt(i)){
                    return result;
                }
            }
            result = result + s.charAt(i);
        
        }
        return result;
    }
}
