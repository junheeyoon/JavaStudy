class Solution {
    public int arrayNesting(int[] nums) {
        int[] visit = new int[nums.length];
        int result = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(visit[i] == 0){
                
                int val = dfs(i, 0, visit, nums);
                result = Math.max(val, result);
            }
        }
        return result;
    }
    
    public int dfs(int x, int cnt, int[] visit, int[] nums){
        
        cnt += 1;
        visit[x] = 1;
        int nx = nums[x];
        if(visit[nx] == 0){
            return dfs(nx, cnt, visit, nums);
        }
        
        return cnt;
    }
}
