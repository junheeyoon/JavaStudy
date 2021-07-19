class Solution {
    public String removeDuplicateLetters(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            if(stack.empty()){
                stack.push(s.charAt(0));
            }
            else{
                if(stack.contains(s.charAt(i))){
                    continue;
                }
                char ch = s.charAt(i);
                if(stack.peek() > ch){
                    while(!stack.empty() && stack.peek() > ch){
                        if(s.substring(i).contains(Character.toString(stack.peek()))){
                            stack.pop();
                        }
                        else{
                            break;
                        }
                    }
                }
                stack.push(ch);
            }
        }
        String str = "";
        while(!stack.empty()){
            str = stack.pop() + str;
        }
        
        return str;
    }
}
