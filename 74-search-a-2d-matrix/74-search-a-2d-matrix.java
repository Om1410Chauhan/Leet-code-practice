class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*
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
        */
        /* binary search in this 2d matrix question*/
        int m=matrix.length;
        int n=matrix[0].length;
        
        int start=0;
        int end=m*n-1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(matrix[mid/n][mid%n]==target){
                return true;
            }
            else if(matrix[mid/n][mid%n]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
}






