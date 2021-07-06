class Solution {
    public void setZeroes(int[][] matrix) {
        
        List<List<Integer>> set = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                
                if(matrix[i][j] == 0){
                    set.add(Arrays.asList(i, j));
                }
            }
        }
        
        for(int i = 0; i < set.size(); i++){
            
            for(int j = 0; j < matrix.length; j++){
                matrix[j][set.get(i).get(1)] = 0;
            }
            for(int k = 0; k < matrix[0].length; k++){
                matrix[set.get(i).get(0)][k] = 0;
            }
        }
    }
}
