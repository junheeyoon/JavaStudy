class Solution {
    public List<Integer> partitionLabels(String s) {
        
        List <Integer> res = new ArrayList <> ();
        if(s.length() == 0)
            return res;

        Map <Character, Integer> map = new HashMap <> ();
        
        for(int i=0; i<s.length(); ++i){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), i);
            }
            else{
                map.put(s.charAt(i), i);
            }
        }

        int prev = -1;            
        int max = 0;

        for(int i=0; i<s.length(); ++i){
            char ch = s.charAt(i);
            max = Math.max(max, map.get(ch));
            if(max == i){
                res.add(max - prev);
                prev = max;
            }
        }
        return res;
    }
}
