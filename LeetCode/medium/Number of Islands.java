class Solution {
    
    boolean[][] visit = new boolean[301][301];
    int[] ax = {-1, 1, 0, 0};
    int[] ay = {0, 0, -1, 1};
    int result = 0;
    public int numIslands(char[][] grid) {
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){          
                if(grid[i][j] == '1' && visit[i][j] == false){
                    result += 1;
                    dfs(i,j, grid);
                }
            }
        }
        return result;
    }
    
    public void dfs(int x, int y, char[][] grid){
        
        visit[x][y] = true;
        for(int k = 0; k < 4; k++){
            
            int nx = x + ax[k];
            int ny = y + ay[k];
            if(nx >= 0 && ny >= 0 && nx < grid.length && ny < grid[0].length){
                if(visit[nx][ny] == false && grid[nx][ny] == '1'){
                    dfs(nx, ny, grid);
                }    
            }
        }
    }
}
