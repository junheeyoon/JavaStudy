class Solution {
    
    int[][] visit = new int[51][51];
    int[] ax = {-1, 1, 0, 0};
    int[] ay = {0, 0, -1, 1};
    int result = 0;
    int cnt = 0;
    public int maxAreaOfIsland(int[][] grid) {
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(visit[i][j] == 0 && grid[i][j] == 1){
                    cnt = 0;
                    dfs(i, j, grid);
                    System.out.println(cnt);
                    result = Math.max(result, cnt);
                }
            }
        }
        return result;
    }
    
    public void dfs(int x, int y, int[][] grid){
        visit[x][y] = 1;
        cnt++;
        for(int k = 0; k < 4; k++){
            int nx = ax[k] + x;
            int ny = ay[k] + y;
            
            if(nx >= 0 && ny >= 0 && nx < grid.length && ny < grid[0].length){
                if(visit[nx][ny] == 0 && grid[nx][ny] == 1){
                    dfs(nx, ny, grid);
                }
            }
        }
    }
}
