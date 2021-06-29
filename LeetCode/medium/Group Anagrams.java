class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> a = new HashMap<>();
        
        for(String s: strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorteds = new String(c);
            List<String> list=a.getOrDefault(sorteds, new ArrayList<>());
            list.add(s);
            a.put(sorteds,list);

        }
        //System.out.println(a);
        return new ArrayList<>(a.values());
    }
}
