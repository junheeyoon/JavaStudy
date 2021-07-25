class Solution {
    int[] visit = new int[11];
    public int minMutation(String start, String end, String[] bank) {
        
        int result = dfs(start, end, bank, 0);
        
        return result;
    }
    
    public int diff(String s, String e){
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != e.charAt(i)){
                cnt++;
            }
        }
        
        return cnt;
    }
    
    public int dfs(String start, String end, String[] bank, int val){

        if(end.equals(start)){
            return val;
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < bank.length; i++){
            if(diff(start, bank[i]) == 1 && visit[i] == 0){
                visit[i] = 1;
                int ret = dfs(bank[i], end, bank, val+1);
                if(ret != -1) {
                    min = Math.min(min, ret);
                }
                visit[i] = 0;
            }         
        }
        
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
