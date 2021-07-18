class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int[][] dp = new int[triangle.size()+1][triangle.size()+1];
        
        for(int i = 1; i <= triangle.size(); i++){
            for(int j = 1; j <= triangle.get(i-1).size(); j++){
                if(j == 1){
                    dp[i][j] = dp[i-1][j] + triangle.get(i-1).get(j-1);
                }
                else if(j == triangle.get(i-1).size()){
                    dp[i][j] = dp[i-1][j-1] + triangle.get(i-1).get(j-1);
                }
                else{
                    dp[i][j] = Math.min(dp[i-1][j-1], dp[i-1][j]) + triangle.get(i-1).get(j-1);
                }    
            }
        }
        int result = 100000;
        for(int i = 1; i <= triangle.size(); i++){
            if(result > dp[triangle.size()][i]){
                result = dp[triangle.size()][i];
            }
        }
        return result;
    }
}
