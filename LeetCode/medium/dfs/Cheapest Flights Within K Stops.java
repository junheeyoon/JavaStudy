class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
        int[] arr = new int[n];
        Arrays.fill(arr, Integer.MAX_VALUE);
        
        arr[src] = 0;
        for(int i = 0; i <= k; i++){
            
            int[] temp = arr.clone();
            for(int j = 0; j < flights.length; j++){
                
                int u = flights[j][0];
                int v = flights[j][1];
                int w = flights[j][2];
                
                if(arr[u] != Integer.MAX_VALUE){
                    temp[v] = Math.min(temp[v], arr[u] + w);
                }
            }
            
            arr = temp;
            
        }
        
        return arr[dst] == Integer.MAX_VALUE ? -1 : arr[dst];
    }
}
