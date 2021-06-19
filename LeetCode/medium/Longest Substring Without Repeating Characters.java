class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int size = s.length();
        int maxLength = 0;
        int result = 1;
        
        if(size == 0){
            return 0;
        }
        result = 1;
        for(int i = 0; i < size; i++){     
            HashSet<Character> stringSet = new HashSet<>();
            stringSet.add(s.charAt(i));
            for(int j = i+1; j < size; j++){
                if (!stringSet.contains(s.charAt(j))){
                    stringSet.add(s.charAt(j));
                    result = Math.max(result, j - i + 1);
                    continue;
                }
                break;
            }
        }
        return result;
        
    }

}
