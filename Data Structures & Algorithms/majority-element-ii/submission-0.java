class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int length = nums.length / 3;

        Map<Integer, Integer> countNums = new HashMap<>();
        Set<Integer> res = new HashSet<>(); 

        for (int i = 0; i < nums.length; i++) {
            countNums.put(nums[i], countNums.getOrDefault(nums[i], 0) + 1); 

            if (countNums.get(nums[i]) > length) 
                res.add(nums[i]);
        }

        return new ArrayList<>(res);
    }
}