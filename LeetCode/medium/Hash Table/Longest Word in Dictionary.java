class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        String curMax="";
        
        HashMap<String,Integer> dp = new HashMap<>();
        
        for(int i=0;i<words.length;i++){
            if(words[i].length() == 1){
                dp.put(words[i],1);
                if(words[i].length() > curMax.length())
                    curMax=words[i];
            }
            else
            {
                String prev = words[i].substring(0,words[i].length()-1);
                if(dp.get(prev) != null){
                    dp.put(words[i],1);
                    if(words[i].length() > curMax.length())
                        curMax=words[i];
                }
            }
        }
        
        return curMax;
    }
}
