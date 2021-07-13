class Solution {
    
    boolean[][] visit = new boolean[201][201];
    int[] ax = {-1, 1, 0, 0};
    int[] ay = {0, 0, -1, 1};
    
    public void solve(char[][] board) {
            
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(i == 0 || i == board.length-1 || j == 0 || j == board[0].length-1){
                    if(board[i][j] == 'O' && visit[i][j] == false){
                        dfs(i, j, board);
                    }
                }
                
            }
        }
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'O' && visit[i][j] == false){
                    dfs2(i, j, board);
                }
            }
        }
    }
    
    public void dfs(int x, int y, char[][] board){
        
        visit[x][y] = true;
        for(int k = 0; k < 4; k++){
            int nx = x + ax[k];
            int ny = y + ay[k];
            if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                if(visit[nx][ny] == false && board[nx][ny] == 'O'){
                    dfs(nx, ny, board);
                }    
            }
        }
    }
    
    public void dfs2(int x, int y, char[][] board){
        
        visit[x][y] = true;
        board[x][y] = 'X';
        for(int k = 0; k < 4; k++){
            int nx = x + ax[k];
            int ny = y + ay[k];
            if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                if(visit[nx][ny] == false && board[nx][ny] == 'O'){
                    dfs2(nx, ny, board);
                }    
            }
        }
    }
}
