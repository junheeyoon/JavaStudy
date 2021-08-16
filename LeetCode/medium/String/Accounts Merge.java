class Solution {
    
    Set<String> seen=new HashSet<>();
    HashMap<String, List<String>> map = new HashMap<>();
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        
        Map<String, String> names=new HashMap<>();
        for(List<String> a : accounts){
            String name = a.get(0);
            for(int i = 1; i < a.size(); i++){
                String leadmail = a.get(1);
                String mail = a.get(i);
                if(!map.containsKey(mail)){
                    map.put(mail, new ArrayList<>());
                }
                map.get(leadmail).add(mail);
                map.get(mail).add(leadmail);
                names.put(mail, name);
            }
        }
        List<List<String>> res=new ArrayList<>();
        for(String email: map.keySet()){
            if(!seen.contains(email)){
                List<String> list = dfs(email, new ArrayList<>());
                Collections.sort(list);
                list.add(0, names.get(email));
                res.add(list);
            }
        }
        return res;
    }
    
    public List<String> dfs(String email, List<String> list){
        
        if(seen.contains(email)){
            return list;
        }
        seen.add(email);
        list.add(email);
        for(String a : map.get(email)){
            dfs(a, list);
        }
        return list;
    }
}
