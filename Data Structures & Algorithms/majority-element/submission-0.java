class Solution {
    public int majorityElement(int[] nums) {
        int length = nums.length / 2;

        Map<Integer, Integer> countNums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            countNums.put(nums[i], countNums.getOrDefault(nums[i], 0) + 1); 

            if (countNums.get(nums[i]) > length) return nums[i];
        }

        return -1;
    }
}