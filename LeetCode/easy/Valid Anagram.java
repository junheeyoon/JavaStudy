class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sol1 = s.toCharArray();
        char[] sol2 = t.toCharArray();
        Arrays.sort(sol1);
        Arrays.sort(sol2);
        if(sol1.length != sol2.length){
            return false;
        }
        for(int i = 0; i < sol1.length; i++){
            if(sol1[i] != sol2[i]){
                return false;
            }
        }
        return true;
    }
}
