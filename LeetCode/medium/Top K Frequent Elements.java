class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int[] result = new int[k];
        for(int i = 0; i < nums.length; i++){
            
            map.put(nums[i], map.getOrDefault(nums[i] , 0) + 1);
        }
        List<Integer> keySetList = new ArrayList<>(map.keySet());
		
		// 내림차순
		Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
		
        for(int i = 0; i < k; i++){
            result[i] = keySetList.get(i);
        }
        
        return result;
    }
}
