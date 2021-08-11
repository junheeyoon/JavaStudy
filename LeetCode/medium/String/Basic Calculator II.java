class Solution {
    public int calculate(String s) {
        
        Stack<Integer> t = new Stack<>();
        int val = 0;
        char sign = '+';
        for(int i = 0; i < s.length(); i++){
            
            if(Character.isDigit(s.charAt(i))){
                val = 0;
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    val = val*10 + s.charAt(i) - '0'; 
                    i++;
                }
                i--;
                if(sign == '+'){
                    t.push(val);
                }
                else if(sign == '-'){
                    t.push(-val);
                }
                else if(sign == '*'){
                    val = t.pop() * val;
                    t.push(val);
                }
                else if(sign == '/'){
                    val = t.pop() / val;
                    t.push(val);
                }
            }
            else{
                if(s.charAt(i) != ' '){
                    sign = s.charAt(i);
                }
            }
        }
        int result = 0;
        while(t.size() != 0){
            result += t.pop();
        }
        return result;
    }
}
