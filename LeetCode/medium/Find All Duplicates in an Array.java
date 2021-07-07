class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> result = new ArrayList<>();
        boolean[] check = new boolean[100001]; 
        for(int i = 0; i < nums.length; i++){
            if(!check[nums[i]]){
                check[nums[i]] = true;
            }
            else{
                result.add(nums[i]);    
            }
        }
        return result;
    }
}
