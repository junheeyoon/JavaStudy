class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    
    int[] arr = new int[nums1.length];
    int index = 0;
   
    HashMap<Integer, Integer> map = new HashMap<>();
    
    for(int i = 0; i < nums2.length; i++){
        if(!map.containsKey(nums2[i])){
            map.put(nums2[i], i);
        }
    }
    
    for(int i = 0; i < nums1.length; i++){
        int next = -1;
        
        for(int j = map.get(nums1[i]) + 1; j < nums2.length; j++){
            if(nums2[j] > nums1[i]){
                next = nums2[j];
                break;
            }
        }
        arr[index++] = next;
    }
   
    return arr;
}
}
