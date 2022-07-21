class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int matrixReshape[][]=new int[r][c];
        int row=0;int col=0;
        //row.length=length of 2d matrix or number of rows
        
        // in case if number of elements is less than required in new matrix
        if(r*c==mat.length*mat[0].length){
           for(int i=0;i<mat.length;i++){
              for(int j=0;j<mat[0].length;j++){
                  if(col<c){
                      matrixReshape[row][col]=mat[i][j];
                      col++;
                }else{
                    row++;
                    col=0;
                    j--;
                }
            }
           
           }
             return matrixReshape;
        }
        return mat;
        
    }
    
}
