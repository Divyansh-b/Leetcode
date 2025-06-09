class Solution {
    public void rotate(int[][] matrix) {
        // firstly we will transpose the matrix
        //keep in mind for first for loop of i, we have to go till length-2 times
        for(int i=0;i<matrix.length-1;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //now just need to reverse each row of the matrix.
        for(int i=0;i<matrix.length;i++){
            reverse(matrix,i);
        }
    }
    public void reverse(int[][] arr,int row){
        int i=0;
        int j=arr[0].length-1;
        while(i<j){
            int temp=arr[row][i];
            arr[row][i]=arr[row][j];
            arr[row][j]=temp;
            i++;
            j--;
        }
    }
}