class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        
        double[][] cars = new double[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        
        Arrays.sort(cars, (a, b) -> Double.compare(a[0], b[0]));
        
        Deque<Double> stack = new ArrayDeque<>();
        
        for (int i = n - 1; i >= 0; i--) {
            double currentPosition = cars[i][0];
            double currentSpeed = cars[i][1];
            
            double time = (target - currentPosition) / currentSpeed;
            
            if (!stack.isEmpty() && time <= stack.peek()) {
                continue; 
            }

            stack.push(time);
        }
        return stack.size();
    }
}
/* 
Initial Thoughts: 
(target - position[i]) / speed[i]  

add this to the set. 
return the size of the set 
--- 

Improvements: Change of approach. 
Create pairs (position, speed) in an 2D Array then 
Sort the array in ascending order. 

We loop the pairs in reverse order, so that the one element is closer to the target. 
- we will inserted the time into stack, only if the current pairs time is greater than or equal to stack's top element. 
- If any pair is greater than the stack's top element, that means the cars speed is greater, but 
- according to the question car can't overtake another car, but when it catches up to other car, current car's will take the same speed of the car ahead. Overall, they become a car fleet. 

*/
