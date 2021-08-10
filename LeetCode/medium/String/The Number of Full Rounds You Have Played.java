class Solution {
    public int numberOfRounds(String startTime, String finishTime) {
        String[] t1 = startTime.split(":");
        String[] t2 = finishTime.split(":");
        int r1 = 0;
        int v1 = Integer.parseInt(t1[0]);
        int v2 = Integer.parseInt(t2[0]);
        int v3 = Integer.parseInt(t1[1]);
        int v4 = Integer.parseInt(t2[1]);
        if(v2 - v1 >= 0){
            if(v2 - v1 == 0 && v3 > v4){
                r1 = v2 - v1 + 24;
            }
            else{
                r1 = v2 - v1;    
            }
        }
        else{
            r1 = v2 - v1 + 24; 
        }
     
        int r2 = 0;
        int m = 0;
        int s = 0;
        m = v3 / 15;
        s = v3 % 15;
        int m2 = 0;
        if(s > 0){
            m = m + 1;
        }
        m2 = v4 / 15;
        
        if(r1*4 + (m2 - m) == -1){
            return 0;
        }
        else{
            return r1*4 + (m2 - m);    
        }
       
    }
}
