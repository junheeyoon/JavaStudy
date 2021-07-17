class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int[] check = new int[isConnected.length+1];
        int result = 0;
        for(int i = 1; i <= isConnected.length; i++){
            for(int j = 1; j <= isConnected.length; j++){
                if(check[j] == 0 && isConnected[i-1][j-1] == 1){
                    result += 1;
                    dfs(j, isConnected, check);
                }
            }
        }
        return result;
    }
    
    public void dfs(int x, int[][] isConnected, int[] check){
        
        check[x] = 1;
        for(int i = 1; i <= isConnected.length; i++){
            if(check[i] == 0 && isConnected[x-1][i-1] == 1){
                dfs(i, isConnected, check);
            }
        }
    }
}
