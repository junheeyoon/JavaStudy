class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {    
        List<List<Integer>> output = new ArrayList<>();
        helper(output, graph, 0, new ArrayList<>());
        return output;
    }
    public void helper(List<List<Integer>> output, int[][] graph, int start, List<Integer> path){
        if(start==graph.length-1){
            path.add(start);
            output.add(path);
            return;
        }
        path.add(start);
        for(int i=0; i<graph[start].length; i++){
            helper(output, graph, graph[start][i], new ArrayList<>(path));
        }
    }
}
