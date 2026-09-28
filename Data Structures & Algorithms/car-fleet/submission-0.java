class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Set<Integer> set = new HashSet<>(); 

        for(int i = 0; i < position.length; i++) {
            set.add((target - position[i]) / speed[i]); 
        }
        return set.size();
    }
}
/* 
Initial Thoughts: 
(target - position[i]) / speed[i]  

add this to the set. 
return the size of the set
*/
