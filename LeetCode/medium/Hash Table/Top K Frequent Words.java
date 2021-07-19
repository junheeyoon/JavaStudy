class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> result = new ArrayList<String>();
        for(int i = 0; i < words.length; i++){    
            map.put(words[i], map.getOrDefault(words[i], 0)+1);
        }
        
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        Collections.sort(list, (o1, o2) -> (map.get(o2)).compareTo(map.get(o1)));
        for(int i = 0; i < k; i++){
            result.add(list.get(i));
        }
        
        return result;
    }
}
