class Solution {
    int[][] visit = new int[501][501];
    int[] ax = {-1, 1, 0, 0};
    int[] ay = {0, 0, -1, 1};
    int cnt = 0;
    int result = 0;
    HashMap<Integer, Integer> map = new HashMap();
    public int largestIsland(int[][] grid) {
            int id = 2;
            for(int i = 0; i < grid.length; i++){
                for(int j = 0; j < grid.length; j++){
                    if(grid[i][j] == 1){
                        dfs(i, j, grid, id);
                        id++;
                    }
                }
            }
            for(int i = 0; i < grid.length; i++){
                for(int j = 0; j < grid.length; j++){
                    if(grid[i][j] == 0){
                        result = Math.max(result, measure(i, j, grid));
                    }
                }
            }
        if(result == 0){
            return grid.length*grid.length;
        }
        return result;
    }
    
    public int measure(int x, int y, int[][] grid){
        int sum = 1;
        HashSet<Integer> c = new HashSet<>();
        for(int k = 0; k < 4; k++){
            int nx = x + ax[k];
            int ny = y + ay[k];
            if(nx >= 0 && ny >= 0 && nx < grid.length && ny < grid.length && !c.contains(grid[nx][ny]) && grid[nx][ny] != 0){
                sum += map.get(grid[nx][ny]);
                c.add(grid[nx][ny]);
            }
        }
        return sum;
    }
    
    public void dfs(int x, int y, int[][] grid, int id){
        visit[x][y] = 1;
        for(int k = 0; k < 4; k++){
            int nx = x + ax[k];
            int ny = y + ay[k];
            if(nx >= 0 && ny >= 0 && nx < grid.length && ny < grid.length){
                if(visit[nx][ny] == 0 && grid[nx][ny] == 1){
                    dfs(nx, ny, grid, id);
                }
            }
        }
        
        map.put(id, map.getOrDefault(id, 0) + 1);
        grid[x][y] = id;
    }
}
