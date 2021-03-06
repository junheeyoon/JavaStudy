class Solution {
    public int numSquares(int n) {
        
        int[] dp = new int[n+1];
        Arrays.fill(dp, 100000);
        dp[1] = 1;
        dp[0] = 0;
        for(int i = 2; i <= n; i++){
            for(int j = 1; j*j <= i; j++){
                dp[i] = Math.min(dp[i-j*j] + 1, dp[i]);    
            }
        }
        
        return dp[n];
    }
}
