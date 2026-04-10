class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                int curCount = 1;
                int nextNum = nums[i] + 1;

                while (set.contains(nextNum)) {
                    curCount++;
                    nextNum += 1;
                }

                if (curCount > maxCount) maxCount = curCount;
                
            }
        }

        return maxCount;
    }
}
