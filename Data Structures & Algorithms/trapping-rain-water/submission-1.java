class Solution {
    public int trap(int[] h) {
        int[] prefix = new int[h.length]; 
        int[] suffix = new int[h.length];    

        int max = 0; 
        for(int i = 0; i < h.length; i++) {
            if (h[i] > max) {
                max = h[i]; 
            } 
            
            prefix[i] = max; 
        }   

        max = 0; 
        for(int i = h.length - 1; i >= 0; i--) {
            if (h[i] > max) {
                max = h[i]; 
            } 
            
            suffix[i] = max; 
        }  

        int ans = 0; 
        for(int i = 0; i < h.length; i++) {
            ans += Math.min(prefix[i], suffix[i]) - h[i];
        }
        return ans;
    }
}

/* 
Method 1: (above code) 
calculate the amount of water trapped at a position, the greater element to the left l and the greater element to the right r of the current position are crucial. 
formula for the trapped water at index i is given by: min(height[l], height[r]) - height[i].
---

Initial Though: If current height is less the previous max height, add the difference to the ans.

    public int trap(int[] h) {
        int l = 0; 
        int r = 1; 
        int sum = 0;
        int count = 0;

        while (r < h.length) {
            if (h[l] > h[r]) {
                sum += h[l] - h[r]; 
                r++;
            } 
            else if (h[l] <= h[r]) {
                count += sum; 
                sum = 0; 
                l = r; 
                r++;
            }
        }
        return count;
    }
*/
