class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0;
        int maxVal = 0;
        int maxFreq = 0;
        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'A']++;
            maxFreq = Math.max(arr[s.charAt(i) - 'A'], maxFreq);
            
            if(i - start + 1 - maxFreq <= k){
                maxVal = Math.max(maxVal, i - start + 1);
            }
            else{
                arr[s.charAt(start) - 'A']--;
                start++;
            }
        }
        return maxVal;
    }
}
