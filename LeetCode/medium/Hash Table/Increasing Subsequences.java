class Solution {
    
    Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        dfs(0, nums, new ArrayList<Integer>());
        return new ArrayList(set);
    }
    
    public void dfs(int index, int[] nums, List<Integer> temp){
        
        if(temp.size() >= 2){
            set.add(new ArrayList(temp));
        }
        
        for(int i = index; i < nums.length; i++){
            
            if(temp.size() == 0 || temp.get(temp.size()-1) <= nums[i]){               
                temp.add(nums[i]);
                dfs(i + 1, nums, temp);
                temp.remove(temp.size()-1);
            }
        }
        
    } 
}
