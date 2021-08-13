class Solution {
    public int lengthOfLIS(int[] nums) {
        int result = 0;
        int[] dp = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                    
                    result = Math.max(dp[i], result);
                }
            }
        }
        return result + 1;
    }
}
