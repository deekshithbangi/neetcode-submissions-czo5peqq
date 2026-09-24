class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false; 

        Deque<Character> stack = new ArrayDeque<>(); 

        for(int i = 0; i < s.length() / 2; i++) {
            stack.push(s.charAt(i)); 
        }
        System.out.println(stack);

        for(int i = s.length()/2; i < s.length(); i++) {
            if (!stack.isEmpty()) {
                char top = stack.peek(); 
                if (top == '(' && s.charAt(i) == ')') stack.pop(); 
                else if (top == '{' && s.charAt(i) == '}') stack.pop();  
                else if (top == '[' && s.charAt(i) == ']') stack.pop(); 
            } else {
                return false;
            }
        }
        return stack.isEmpty(); 
    }
}
