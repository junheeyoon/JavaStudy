class Solution {
    public int integerBreak(int n) {
        if (n <= 1 || n >= 59) throw new IllegalArgumentException("Invalid Input");
        int[] dp = new int[n+1];
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i/2; j++) {
                int prod = Math.max(i-j, dp[i-j]) * Math.max(j, dp[j]);
                dp[i] = Math.max(dp[i], prod);
            }
        }
        return dp[n];
    }
}
