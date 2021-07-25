class Solution {
    public int compress(char[] chars) {
        
        int start = 0, end = 0, write = 0;
        for(; end < chars.length; ){
            while(end < chars.length - 1 && chars[end] == chars[end + 1]){
                end++;
            }
            int currentSequenceLength = end - start + 1;
            chars[write++] = chars[start];
            if(currentSequenceLength > 1){
                String tempSequenceLength = String.valueOf(currentSequenceLength);
                for(char c : tempSequenceLength.toCharArray()){
                    chars[write++] = c;
                }       
            }
            end++;
            start = end;
        }
        return write;
    }
}
