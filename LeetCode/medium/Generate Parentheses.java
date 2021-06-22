class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        
        dfs(result, "", n, n);
        return result;
    }
    public void dfs(List<String> result, String s, int l, int r){
        
        if(l > r){
            return;
        }
        
        if(l == 0 && r == 0){
            result.add(s);
            return;
        }
        
        if(l > 0){
            dfs(result, s + "(", l-1, r);    
        }
        
        if(r > 0){
            dfs(result, s + ")", l, r-1);
        }
    }
}
