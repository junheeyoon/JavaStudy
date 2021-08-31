class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        
        Collections.sort(dictionary);
        
        String[] str = sentence.split(" ");
        String result = "";
        
        for(int i = 0; i < str.length; i++){
            int flag = 0;
            
            for(int j = 0; j < dictionary.size(); j++){
                String s = dictionary.get(j);
                int num = s.length();

                if(str[i].length() >= num){
                    if(s.equals(str[i].substring(0,num))){
                        flag = 1;
                        if(result.equals("")){
                            result += s;
                        }
                        else{
                            result += " " + s;
                        }
                        break;
                    }    
                }
            }
            
            if(flag == 0){
                if(result.equals("")){
                    result += str[i];
                }
                else{
                    result += " " + str[i];
                }
            }
        }
        
        return result;
    }
}
