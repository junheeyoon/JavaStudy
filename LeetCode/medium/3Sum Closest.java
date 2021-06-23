class Solution {
    
    int result = 99999;
    int val = 0;
    public int threeSumClosest(int[] nums, int target) {
        
        
        int len = nums.length;
        dfs(0, 0,0, target, nums);
        
        return val;
    }
    
    public void dfs(int i, int cnt, int sum, int target, int[] nums){
        
        if(cnt == 3){
            if(result > Math.abs(target - sum)){
                result = Math.abs(target - sum);
                val = sum;
            }
            return;
        }
        if(i >= nums.length){
            return;
        }
        dfs(i+1, cnt+1, sum+nums[i], target, nums);
        
        dfs(i+1, cnt, sum, target, nums);
        
    }
}
