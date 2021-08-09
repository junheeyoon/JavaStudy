class Solution {
    public boolean wordPattern(String pattern, String s) {
            
        String[] ss = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        if(ss.length != pattern.length()){
            return false;
        }
        for(int i = 0; i < pattern.length(); i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(map.containsValue(ss[i])){
                    return false;
                }
                map.put(pattern.charAt(i), ss[i]);
            }
            else{
                if(!map.get(pattern.charAt(i)).equals(ss[i])){
                    return false;
                }
            }
            
        }
        return true;
    }
}
