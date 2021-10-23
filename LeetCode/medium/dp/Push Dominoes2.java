class Solution {
    public String pushDominoes(String dominoes) {
        
        char[] c = new char[dominoes.length()+2];
        char[] result = new char[dominoes.length()];
        c[0] = 'L';
        c[dominoes.length()+1] = 'R';
        for(int i = 1; i <= dominoes.length(); i++){
            c[i] = dominoes.charAt(i-1);
        }
        
        char pre = c[0];
        int cur_index = 1;
        int pre_index = 0;
        
        for(int i = 1; i < c.length; i++){
            if(c[pre_index] == 'L' && c[i] == 'L'){
                for(int j = pre_index; j < i; j++){
                    c[j] = 'L';
                }
                pre_index = i;
            }
            else if(c[pre_index] == 'L' && c[i] == 'R'){
                pre_index = i;
            }
            else if(c[pre_index] == 'R' && c[i] == 'R'){
                for(int j = pre_index; j < i; j++){
                    c[j] = 'R';
                }
                pre_index = i;
            }
            else if(c[pre_index] == 'R' && c[i] == 'L'){
                int l = pre_index+1;
                int r = i-1;
                while(l < r){
                    c[l] = 'R';
                    c[r] = 'L';
                    l++;
                    r--;
                }
                pre_index = i;
            }
            else{
                continue;
            }
        }
        String str = new String(c);
        return str.substring(1, c.length-1);
    }
}
