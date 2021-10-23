class Solution {
    public int deleteAndEarn(int[] nums) {
        
        int[] dp = new int[100001];
        int[] arr = new int[100001];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num: nums){
            if(max < num){
                max = num;
            }
            if(min > num){
                min = num;
            }
            arr[num] += num;
        }
        
        dp[min] = arr[min];
        for(int i = min+1; i <= max; i++){
            if(dp[i-1] > dp[i-2] + arr[i]){
                dp[i] = dp[i-1];
            }
            else{
                dp[i] = dp[i-2] + arr[i];
            }
        }
        
        return dp[max];
    }
}
