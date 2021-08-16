class Solution {
    public int findMinDifference(List<String> timePoints) {
        
        int[] times = new int[timePoints.size()];
        int index = 0;
        for(String a : timePoints){
            String[] arr = a.split(":");
            
            int time = 0;
            time += Integer.parseInt(arr[0]) * 60;
            time += Integer.parseInt(arr[1]);
            
            times[index++] = time;
        }
        
        Arrays.sort(times);
        int min = 9999999;
        for(int i = 1; i < times.length; i++){
            if(min > times[i] - times[i-1]){
                min = times[i] - times[i-1];
            }
        }
        
        if(min > (24*60 - times[times.length-1] + times[0])){
            min = (24*60 - times[times.length-1] + times[0]);
        }
        return min;
        
    }
}
