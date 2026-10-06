class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        for(int i = 0; i < matrix.length; i++) {
            int x = matrix[i][0]; 
            int y = matrix[i][matrix[i].length - 1];
            
            if (target >= x && target <= y) {
                int left = 0; 
                int right = matrix[0].length - 1;  

                while (left <= right) {
                    int mid = (left + right) / 2; 

                    if (matrix[i][mid] == target) {
                        return true;
                    } else if (target > matrix[i][mid]) {
                        left = mid + 1; 
                    } else if (target < matrix[i][mid]) {
                        right = mid - 1; 
                    }
                }
            }
        } 

        return false;
    }
}
