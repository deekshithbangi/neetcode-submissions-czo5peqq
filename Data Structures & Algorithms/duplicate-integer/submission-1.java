class Solution {
    public boolean hasDuplicate(int[] nums) {
       /* 
        Plan - 1 
        Select an element and loop throught the array. 
        O(n^2)
       

       for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] == nums[i]) {
                    return true;
                }
            }
       }
       return false;

    */

    /* 
        Plan - 2 
        Select and element and if the element is not in set, add it. 
        if current element is in set, return true
    */ 
        Set<Integer> uniqueElements = new HashSet<>();
        
        for(int num : nums) {
            if( !uniqueElements.contains(num) ) {
                uniqueElements.add(num); 
            }
            else {
                return true;
            }
        }
        return false; 
    }
}