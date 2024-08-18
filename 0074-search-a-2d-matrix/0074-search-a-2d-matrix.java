class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = 0;
        int col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0){   // [[1,3],[2,4]]
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }
}