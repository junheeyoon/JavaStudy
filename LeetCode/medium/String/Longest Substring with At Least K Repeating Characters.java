class Solution {
    public int longestSubstring(String s, int k) {
        if (s.length() < k){
            return 0;
        }
        int[] freqs = new int[26];
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            freqs[c - 'a']++;
        }
        
        HashSet<Character> invalid = new HashSet();
        
        for (int i = 0; i < 26; i++){
            if (freqs[i] > 0 && freqs[i] < k){
                invalid.add((char)(i + 'a'));
            }
        }
        
        if (invalid.size() == 0){
            return s.length();
        }
        
        int max = 0, prev = -1;
        for (int i = 0; i < s.length(); i++){
            if (invalid.contains(s.charAt(i))){
                int subLen = longestSubstring(s.substring(prev + 1, i), k);
                max = subLen > max?subLen:max;
                prev = i;
            }
        }
        int subLen = longestSubstring(s.substring(prev + 1, s.length()), k);
        max = subLen > max?subLen:max;
        return max;
    }
}
