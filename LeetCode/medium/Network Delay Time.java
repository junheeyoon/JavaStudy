class Solution {
    
    public int networkDelayTime(int[][] times, int n, int k) {
        int INF = 10001;
        int[][] dp = new int[n+1][n+1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], INF);
            dp[i][i] = 0;
        }
        for (int[] time : times) {
            dp[time[0] - 1][time[1] - 1] = time[2];
        }

        for (int m = 0; m < n; m++) {
            for (int i = 0; i < n; i++) {
                if (dp[i][m] != INF) {
                    for (int j = 0; j < n; j++) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][m] + dp[m][j]);
                    }
                }
            }
        }

        int maxDelay = 0;
        for (int i = 0; i < n; i++) {
            maxDelay = Math.max(maxDelay, dp[k-1][i]);
        }

        return maxDelay == INF ? -1 : maxDelay;
    }
}
