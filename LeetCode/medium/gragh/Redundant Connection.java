class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        
        
        int[][] arr = new int[edges.length+1][edges.length+1];
        for(int i = 0; i < edges.length; i++){
            arr[edges[i][0]][edges[i][1]] = 1;
            arr[edges[i][1]][edges[i][0]] = 1;
            arr[edges[i][1]][edges[i][1]] = 1;
            arr[edges[i][0]][edges[i][0]] = 1;
        }
        
        for(int i = edges.length-1; i >= 0; i--){
            int[] check = new int[edges.length+1];
            arr[edges[i][0]][edges[i][1]] = 0;
            arr[edges[i][1]][edges[i][0]] = 0;
            int result = 0;
            for(int j = 1; j <= edges.length; j++){
                for(int k = 1; k <= edges.length; k++){
                    if(arr[j][k] == 1 && check[k] == 0){
                        result++;
                        dfs(k, arr, check);
                    }
                }
            }
            
            if(result == 1){
                return edges[i];
                
            }
            else{
                arr[edges[i][0]][edges[i][1]] = 1;
                arr[edges[i][1]][edges[i][0]] = 1;
                continue;
            }
        }
        
        return new int[4];
    }
    
    public void dfs(int x, int[][] arr, int[] check){
        
        check[x] = 1;
        for(int i = 1; i <= arr.length-1; i++){
            if(arr[x][i] == 1 && check[i] == 0){
                dfs(i, arr, check);
            }
        }
    }
    
}
