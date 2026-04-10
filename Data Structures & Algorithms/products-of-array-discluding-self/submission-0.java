class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] prefixArray = new int[n];
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            prefixArray[i] = prefix * nums[i];
            prefix = prefixArray[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(prefixArray[i] + " ");
        }
        System.out.println();
        
        int[] postfixArray = new int[n];
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            postfixArray[i] = suffix * nums[i];
            suffix = postfixArray[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(postfixArray[i] + " ");
        }
        System.out.println();
        int[] res = new int[n];

        if(n >= 2) {
            res[0] = 1 * postfixArray[1]; 
            res[n - 1] = prefixArray[n - 2];
        }
        for (int i = 1; i < n - 1; i++) {
            res[i] = prefixArray[i - 1] * postfixArray[i + 1];
        } 

        return res;


    }
}  
