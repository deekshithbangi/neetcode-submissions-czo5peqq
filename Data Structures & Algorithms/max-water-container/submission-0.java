class Solution {
    public int maxArea(int[] heights) {
        int right = heights.length - 1; 
        int left = 0; 
        int ans = 0;

        while (left < right) {
          if(heights[left] < heights[right]) { 
            ans = Math.max(ans, (right - left) * heights[left]); 
            left++; 
          }   
          else if (heights[right] < heights[left]) {
            ans = Math.max(ans, (right - left) * heights[right]); 
            right--;
          } 
          else {
            ans = Math.max(ans, (right - left) * heights[left]); 
            left++;
          }
        }
        return ans;
    }
}
