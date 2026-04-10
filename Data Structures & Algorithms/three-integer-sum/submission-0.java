class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < n - 2; i++) {
            for(int j = i+1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplets = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                        Collections.sort(triplets);
                        if (!res.contains(triplets)) {
                            res.add(triplets);
                        }
                    }
                }
            }
        }
        return res;
    }
}
