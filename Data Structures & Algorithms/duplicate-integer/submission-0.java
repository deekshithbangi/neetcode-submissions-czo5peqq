class Solution {
    public boolean hasDuplicate(int[] nums) {
       /* 
        Plan - 1 
        Select an element and loop throught the array. 
        O(n^2)
       */

       for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] == nums[i]) {
                    return true;
                }
            }
       }
       return false;
    }
}