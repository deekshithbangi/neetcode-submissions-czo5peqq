class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false; 

        Deque<Character> stack = new ArrayDeque<>(); 

        for(int i = 0; i < s.length(); i++) {

            if (!stack.isEmpty()) {
                char top = stack.peek(); 
                if (top == '(' && s.charAt(i) == ')') stack.pop(); 
                else if (top == '{' && s.charAt(i) == '}') stack.pop();  
                else if (top == '[' && s.charAt(i) == ']') stack.pop(); 
            } 
            else {
                stack.push(s.charAt(i)); 
            }            
        }
        return stack.isEmpty(); 
    }
}
/* 
Initial Thoughts: Add the characters in stack till the half of the string. 
Then loop other half to check the current character is reverse of top of the stack, pop if same. 

Failed Test Case: "()[]{}" 
Not excepted this test case. 

Improvements: Change the approach on how we compare the opposite of characters. 
- Use a single loop to add and remove characters in stack 
- If stack isn't empty, pop a character from stack, if the current and top of the stack are inverse of eachother. 
- else add element to the stack. 
- At the end, if the loop still has any characters left then its not valid Parentheses
*/