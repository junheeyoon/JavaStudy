class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();        
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        
        List<Character> keyList = new ArrayList<>(map.keySet());
        
        Collections.sort(keyList, (o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        for(Character a: keyList){
            String str = Character.toString(a);
            result.append(str.repeat(map.get(a)));
        }
        
        return result.toString();
    }
}
