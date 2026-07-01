class Solution {
    public boolean hasDuplicate(int[] nums) {
       ArrayList<Integer> unique = new ArrayList<>(); 

       for(int num : nums) { 
        if (unique.contains(num)) {
            return true;
        } unique.add(num); 
       } 
       return false;
    }
}