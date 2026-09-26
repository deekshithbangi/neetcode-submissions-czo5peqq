class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>(); 

        for(int i = 0; i < tokens.length; i++) {
            String str = tokens[i]; 

            if (str.matches("^[+-]?\\d+$")) {
                stack.add(Integer.valueOf(str)); 
            } else if (stack.size() >= 2) { 
                int a = stack.pop(); 
                int b = stack.pop(); 
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
