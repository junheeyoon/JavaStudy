class Solution {
    public String decodeString(String s) {
        
        Stack<String> stack=new Stack<>();
        Stack<Integer> num=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;){
            char ch=s.charAt(i);
            if(ch=='[' || Character.isLetter(ch)){
                stack.push(String.valueOf(ch));
                i++;
            }
            
            else if(Character.isDigit(ch)){
                int val=0;
                while(i<n && Character.isDigit(s.charAt(i))){
                    val=val*10+(s.charAt(i)-'0');
                    i++;
                }
                num.push(val);
            }
            
            else if(ch==']'){
                String temp="";
                while(!stack.isEmpty() && !stack.peek().equals("[")){
                    temp=stack.pop()+temp;
                }
                stack.pop();
                int times=num.pop();
                String newStr="";
                while(times-->0){
                    newStr+=temp;
                }
                stack.push(newStr);
                i++;
        }
            
            
        }
        
        String result="";
        while(!stack.isEmpty()){
            result=stack.pop()+result;
        }
        
        return result;
        
    }
}
