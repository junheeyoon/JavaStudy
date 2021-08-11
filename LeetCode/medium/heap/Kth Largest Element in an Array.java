class Solution {
    public int findKthLargest(int[] nums, int k) {
        Integer[] newArray = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
           newArray[i] = Integer.valueOf(nums[i]);
        }
        Arrays.sort(newArray,Collections.reverseOrder());
        
        return newArray[k-1];       
    }
}
