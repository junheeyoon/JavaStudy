class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer, Integer> map = new HashMap<>();
        String[] result = new String[score.length];
        for(int i = 0; i < score.length; i++){
            map.put(i, score[i]);
        }
        
        List<Integer> keySetList = new ArrayList<>(map.keySet());
		// 내림차순
		Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
		int cnt = 1;
        for(Integer key : keySetList) {
            if(cnt == 1){
                result[key] = "Gold Medal";
            }
            else if(cnt == 2){
                result[key] = "Silver Medal";
            }
            else if(cnt == 3){
                result[key] = "Bronze Medal";
            }
            else{
                result[key] = String.valueOf(cnt);
            }
            cnt++;
		}

        return result;
    }
}
