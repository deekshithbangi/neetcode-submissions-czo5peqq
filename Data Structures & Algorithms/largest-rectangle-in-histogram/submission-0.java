class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>(); 

        for(int h : heights) {
            stack.push(h); 

            if (stack.size() >= 2 && stack.get(stack.size() - 2) >= stack.get(stack.size() - 1)) {
                stack.pop(); 
                stack.pop();  
                stack.push(h*2); 
            } else if (stack.size() >= 2 && stack.get(stack.size() - 2) < stack.get(stack.size() - 1)){
                stack.clear();
            }
        } 
        int s = 0; 
        while (stack.size() > 0) {
            s += stack.pop(); 
        } 
        return s; 
    }
}
