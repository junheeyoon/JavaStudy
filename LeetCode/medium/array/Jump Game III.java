class Solution {
    public boolean canReach(int[] arr, int start) {
        int[] visit = new int[arr.length];
        int result = 0;
        result = dfs(arr, start, visit);
        
        if(result >= 1){
            return true;
        }
        return false;
    }
    
    public int dfs(int[] arr, int start, int[] visit){
        
        int result = 0;
        if(start >= arr.length){
            return 0;
        }
        
        if(start < 0){
            return 0;
        }
        if(visit[start] == 1){
            return 0;
        }
        visit[start] = 1;
        if(arr[start] == 0){
            return 1;
        }
        result += dfs(arr, start + arr[start], visit);
        result += dfs(arr, start - arr[start], visit);
        
        return result;
    }
}
