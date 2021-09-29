class Solution {
    public String pushDominoes(String dominoes) {
        char[] ch = new char[dominoes.length() + 2];
        ch[0] = 'L';
        ch[ch.length - 1] = 'R';
        
        for(int k = 1; k < ch.length - 1; k++){
            ch[k] = dominoes.charAt(k - 1);
        }
        
        int i = 0;
        int j = 1;
        
        while(j < ch.length){
            while(ch[j] == '.'){
                j++;
            }
            if(ch[i] == 'L' && ch[j] == 'L'){//L...L
                while(i != j){
                ch[i] = 'L';
                    i++;
                }
                j++;
            }else if(ch[i] == 'R' && ch[j] == 'R'){//R...R
               while(i != j){
                 ch[i] = 'R';
                 i++;
              }
               j++;
            }else if(ch[i] == 'L' && ch[j] == 'R'){//L...R
                i = j;
                j++;
            }else if(ch[i] == 'R' && ch[j] == 'L'){//R...L or R....L odd as well as even cases to be handled
                int rTemp = i + 1;
                int lTemp = j - 1;
                while(rTemp < lTemp){
                    ch[rTemp] = 'R';
                    ch[lTemp] = 'L';
                    rTemp++;
                    lTemp--;
                }
                i = j;
                j++;
            }
        }
        
        StringBuilder sb = new StringBuilder("");
        for(int k = 1; k < ch.length - 1; k++){
            sb.append(ch[k]);
        }
        
        return sb.toString();
    }
}
