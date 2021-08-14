class Solution {
    public boolean PredictTheWinner(int[] nums) {
        
        return dfs(0, nums.length-1, nums, 0, 0, 0);
    }
    
    public boolean dfs(int start, int end, int[] nums, int a, int b, int turn){
        
        
        if(start>end){
            return a >= b;
        }
        
        if(turn % 2 ==0){
            
            return dfs(start+1, end, nums, a+nums[start], b, turn+1) || dfs(start, end-1, nums, a+nums[end], b, turn+1);
        }
        else{
            
            return dfs(start+1, end, nums, a, b+nums[start], turn+1) && dfs(start, end-1, nums, a, b+nums[end], turn+1);
        }
        
    }
}
