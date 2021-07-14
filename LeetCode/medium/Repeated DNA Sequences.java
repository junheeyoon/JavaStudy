class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> val = new ArrayList<>();
        Map<String, Integer> result = new HashMap<>();
        for(int i = 0; i <= s.length()-10; i++){
            
            String s1 = s.substring(i, i+10);
           
            result.put(s1, result.getOrDefault(s1, 0) + 1);
        }
        
        for(String c:result.keySet()){
            if(result.get(c)>1)
                val.add(c);
        }
        return val;
    }
}
