class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>(); 

        for(int i = 0; i < tokens.length; i++) {
            String str = tokens[i]; 

            if (str.matches("^[+-]?\\d+$")) {
                stack.add(Integer.valueOf(str)); 
            } else if (stack.size() >= 2) { 
                int b = stack.pop(); 
                int a = stack.pop(); 
                int c = 0; 
                switch (str) {
                    case "+" -> c = a + b; 
                    case "-" -> c = a - b; 
                    case "*" -> c = a * b; 
                    case "/" -> c = a / b; 
                } 
                stack.push(c);
            }     
        }
        return stack.pop();
    }
}

/* 
Initiution: 
Use stack to push integers, 
if we encounter any operator then 
    pop 2 times to get numbers then 
    use the operator do the math, 
    at last push back to the stack. 
*/
