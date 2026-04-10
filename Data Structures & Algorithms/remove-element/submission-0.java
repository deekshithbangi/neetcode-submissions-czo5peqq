class Solution {
    public int removeElement(int[] nums, int val) {
         ArrayList<Integer> tmp = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                tmp.add(nums[i]);
            }
        }

        for (int i = 0; i < tmp.size(); i++) {
            nums[i] = tmp.get(i); 
        }
            
        return tmp.size();
    }
}