class Solution {
    // public void setRows(int[][] matrix,int i){
    //     int m = matrix[0].length;
    //     for(int j = 0; j < m; j++){
    //         if(matrix[i][j] != 0){
    //             matrix[i][j] = -1;
    //         }
    //     }
    // }
    // public void setCol(int[][] matrix,int j){
    //     int n = matrix.length;
    //     for(int i = 0; i < n; i++){
    //         if(matrix[i][j] != 0){
    //             matrix[i][j] = -1;
    //         }
    //     }
    // }
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] row = new int[n];
        int[] col = new int[m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                   row[i] = 1;
                   col[j] = 1; 
                }
            }
        } 
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        } 

    }
}