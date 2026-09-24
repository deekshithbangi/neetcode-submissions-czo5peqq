class Solution {
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
}
