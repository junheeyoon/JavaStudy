class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        for(int i = 0; i < points.length; i++){
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int j = 0; j < points.length; j++){
                if(i == j){
                    continue;
                }
                int x = points[i][0] - points[j][0];
                int y = points[i][1] - points[j][1];
                int dist = x*x + y*y;
                
                map.put(dist, map.getOrDefault(dist, 0) + 1);
            }
            for(int t: map.keySet()){
                result += map.get(t) * (map.get(t) - 1);
            }
        }
        return result;
    }
}
