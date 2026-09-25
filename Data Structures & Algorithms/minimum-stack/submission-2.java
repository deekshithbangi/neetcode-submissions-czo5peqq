class MinStack {

    Stack<Integer> stack = new Stack<>(); 
    Stack<Integer> trackMin = new Stack<>(); 

    public MinStack() {
    }
    
    public void push(int val) {
        stack.push(val); 
        // if trackmin is really empty, then we add. 
        if (trackMin.isEmpty()) { 
            trackMin.push(val); 
        } else { 
            if(val > trackMin.peek()) {
                int smaller = trackMin.pop(); 
                trackMin.push(val); 
                trackMin.push(smaller);
            } else {
                trackMin.push(val);
            }
        } 
    }
    

    public void pop() {
        if (stack.peek().equals(trackMin.peek())) trackMin.pop(); 
        if (stack.size() > 0) stack.pop(); 
    }
    
    public int top() {
        return stack.peek();
    }
    
    public Integer getMin() {

        if (trackMin.size() > 0) {
            return trackMin.peek(); 
        } else {
            return null;
        }
    }
}  


/* 
Initial Thoughts:  
I am not sure how to initial the stack object. 
Since class has a constructor, i have declared the Stack in it.  
but, It can cause variable not found. 

So, declared the stack as a class variable, so that it can be referenced by any call methods, which are defined in the class. 
--- 

Approach: 
- Use two stacks. One - for keep track of getMin(). 
- The entire logic depends on, how we are handaling the minimum element. 
- Case one, if the trackMin does not had any element in it, we add 
- if it has already an element, we compare does the current element is larger than the top element of trackMin, if so, we pop the top and add current followed by popped element. 
- if the current element is smaller than the trackMin's top, we will add. 
--- 

before using stack.peek(), always check weather it has any elements in it. I.e (stack.size() > 0)
*/