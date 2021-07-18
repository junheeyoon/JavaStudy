class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();

        for(int i = 1; i <= 9; i++){
            dfs(i, n, result);
        }
        return result;
        
    }
    public void dfs(int index, int n, List<Integer> result){
        
        if(index > n){
            return;
        }
        if(index <= n){
            result.add(index);
        }
        for(int i = 0; i <= 9; i++){
            int val = index*10+i;
            dfs(val, n, result);
        }
    }
}
