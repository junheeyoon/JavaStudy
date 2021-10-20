class Solution {
    
    public void dfs(int node,String s,List<Integer>[] graph,PriorityQueue<Integer> index,
                   PriorityQueue<Character> characters,boolean[] visited){
        if(visited[node]) return;
        visited[node] = true;
        index.offer(node);
        characters.offer(s.charAt(node));
        for(int next : graph[node]) dfs(next, s, graph, index, characters, visited);
    }
    
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n = s.length();
        List<Integer>[] graph = new ArrayList[n];
        
        for(int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        
        for(List<Integer> pair : pairs){
            graph[pair.get(0)].add(pair.get(1));
            graph[pair.get(1)].add(pair.get(0));
        }
        
        char[] res = s.toCharArray();
        boolean[] visited = new boolean[n];
        
        for(int i = 0; i < n; i++){
            if(!visited[i] && graph[i].size() > 0){
                PriorityQueue<Integer> index = new PriorityQueue<>();
                PriorityQueue<Character> characters = new PriorityQueue<>();
                dfs(i, s, graph, index, characters, visited);
                while(!index.isEmpty()) res[index.poll()] = characters.poll();
            }
        }
        return String.valueOf(res);
    }
}
