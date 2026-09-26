class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length]; 

        for(int i = 0; i < temperatures.length; i++) {
            int length = 0; 
            for(int j = i+1; j < temperatures.length; j++) { 
                length++;
                if (temperatures[j] > temperatures[i] ) {
                    ans[i] = length; 
                    break;
                }
            }
        }
        return ans;
    }
}
/*
Initial Thoughts: 
Use 2 loops, to check the higher temperature than the current one.
*/
