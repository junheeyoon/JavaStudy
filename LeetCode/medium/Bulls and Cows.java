class Solution {
    public String getHint(String secret, String guess) {
        String s = new String();
        int num = 0;
        int num2 = 0;
        int[] visit = new int[guess.length()+1];
        for(int i = 0; i < secret.length(); i++){
            
            if(secret.charAt(i) == guess.charAt(i)){
                num += 1;
                visit[i] = 1;
            }
            
            else{
                for(int j = 0; j < guess.length(); j++){
                    if(secret.charAt(i) == guess.charAt(j) && visit[j] == 0 && secret.charAt(j) != guess.charAt(j)){
                        num2 += 1;
                        visit[j] = 1;
                        break;
                    }
                }
            }
        }
        s = s + num;
        s = s + "A";
        s = s + num2;
        s = s + "B";
        return s;
    }
}
