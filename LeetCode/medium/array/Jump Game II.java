class Solution {
	public int jump(int[] nums) {
		int n = nums.length;
        int reachable = 0;
        int count = 0;
        int last = 0;
        
        for(int i=0; i<n-1; i++){
            
            reachable = Math.max(reachable, i + nums[i]);
            if(i == last){
                count++;
                last = reachable;
            }
        }
        
        return count;
	}
}
