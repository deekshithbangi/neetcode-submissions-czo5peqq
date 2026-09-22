class Solution {
    public int maxArea(int[] heights) {
        int right = heights.length - 1; 
        int left = 0; 
        int ans = 0;

        while (left < right) {
            ans = Math.max(ans, Math.min(heights[left], heights[right]) * (right - left)); 
            if (heights[left] < heights[right]) { 
                left++; 
            } else right--;
        }
        return ans;
    }
}
