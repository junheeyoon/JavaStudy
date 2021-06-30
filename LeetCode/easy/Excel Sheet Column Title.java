class Solution {
    public String convertToTitle(int columnNumber) {
        
        String result = "";
        
        while(columnNumber > 0){
            int num = columnNumber % 26;
            if(num == 0){
                char val = 'Z';
                result = val + result;
                columnNumber = columnNumber / 26 -1;
                continue;
            }
            char val = (char)('A' + num - 1);
            result = val + result;
            
            columnNumber = columnNumber / 26;
        }
        return result;
    }
}
