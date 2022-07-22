class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix[0][0]>target){
            return false;
        }
        for(int i=0;i<matrix.length;i++){
           
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}