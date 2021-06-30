class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        
        dfs(result, s, 0, 0);
        return result;
    }
    
    public void dfs(List<String> result, String s, int i, int dots){
        
        if(i < s.length() && isValid(s,i,s.length()) && dots == 3){
            result.add(s);
            return;
        }else if(i == s.length() || dots >= 4){
            return;
        }
        
        int j = i + 1;
        while(j < s.length() && isValid(s, i, j)){
            s = s.substring(0, j) + '.' + s.substring(j);
            dfs(result, s, j+1, dots+1);
            s = s.substring(0, j) + s.substring(j+1);
            j++;
        }
    }
    
    public boolean isValid(String s, int i, int j){
        String tmp= s.substring(i,j);
        if(tmp.length() > 3 || tmp.charAt(0) == '0' && tmp.length() > 1) return false; 
        if(Integer.valueOf(tmp) <= 255){
            return true;
        }
        return false;
    }
}
