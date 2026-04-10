class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> indices = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i]; 
            
            if (indices.containsKey(diff)) {
                return new int[] {indices.get(diff) + 1, i + 1}; 
            }
            
            indices.put(numbers[i], i);
        } 
        return new int[]{};
    }
}
