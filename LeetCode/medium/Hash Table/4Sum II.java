class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int counter = 0;
        for(int i = 0; i<nums1.length; i++){
            for(int j = 0; j<nums2.length; j++){
                hm.put(nums1[i]+nums2[j],hm.getOrDefault(nums1[i]+nums2[j],0)+1);
            }
        }
        for(int a = 0; a<nums3.length; a++){
            for(int b = 0; b<nums4.length; b++){
                if (hm.containsKey(-(nums3[a]+nums4[b]))){
                    counter+=hm.get(-(nums3[a]+nums4[b]));
                }
            }
        }
        return counter;
    }
}
