class Solution {
    int[][] visit = new int[201][201];
    int[] ax = {-1, 1, 0, 0};
    int[] ay = {0,0,-1,1};
    public int countBattleships(char[][] board) {
        
        int result = 0;
        for(int i = 0; i< board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(visit[i][j] == 0 && board[i][j] == 'X'){
                    result += 1;
                    dfs(i, j, board);
                }
            }
        }
        return result;
    }
    
    public void dfs(int x, int y, char[][] board){
        
        visit[x][y] = 1;
        for(int k = 0; k < 4; k++){
            int nx = x + ax[k];
            int ny = y + ay[k];
            
            if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                if(visit[nx][ny] == 0 && board[nx][ny] == 'X'){
                    dfs(nx, ny, board);
                }
            }
        }
    }
}
