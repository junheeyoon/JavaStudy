class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int val = 0;
        for(int i = 0; i < nums.length; i++){
            
            if(cnt == 0){
                val = nums[i];
            }
            
            if(val == nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
            
        }
        
        return val;
    }
}
