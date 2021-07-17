class Solution {
    public int findCenter(int[][] edges) {
        int[] c = new int[edges.length+2];
        
        int result1 = 0;
        int result2 = 0;
        for(int i = 0; i < 2; i++){
            if(c[edges[i][0]] == 1){
                return edges[i][0];
            }
            if(c[edges[i][1]] == 1){
                return edges[i][1];
            }
            c[edges[i][0]] = 1;
            c[edges[i][1]] = 1;
        }
        
        
        return -1;
    }
}
