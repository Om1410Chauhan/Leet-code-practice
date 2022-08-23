class Solution {
    // using recursion
    /*
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0){
            return 0;
        }
        if(matrix.length==1 && matrix[0]==1){
            return 1;
        }
        
        int max=0;
        int currentMax=0;
        for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
               currentMax=findSquare(matrix,i,j);
               if(max<currentMax){
                   max=currentMax;
               }
           }   
        }
        return max*max;
    }
    private int  findSquare(char[] matrix,int i,int j){
        if(i>matrix.length || j>matrix[0].length || matrix[i][j]==0 ){
           return 0;
        }
        int sum=1+Math.min(findSquare(matrix,i+1,j),Math.min(findSquare(matrix,i,j+1)),findSquare(matrix,i+1,j+1));
        return sum;
    }
    
    // using memoiazation
      public int maximalSquare(char[][] matrix) {
        if(matrix.length==0){
            return 0;
        }
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        
        int max=0;
        int currentMax=0;
        for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;i++){
               currentMax=findSquare(matrix,i,j,dp);
               if(max<currentMax){
                   max=currentMax;
               }
           }   
        }
        return max*max;
    }
    private int  findSquare(char[][] matrix,int i,int j,int[][]dp){
        if(i>=matrix.length || j>=matrix[0].length || matrix[i][j]=='0' ){
           return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(matrix[i][j]=='0'){
             return dp[i][j]=0;
        }
        int sum=1+Math.min(findSquare(matrix,i+1,j,dp),Math.min(findSquare(matrix,i,j+1,dp),findSquare(matrix,i+1,j+1,dp)));
        dp[i][j]=sum;
        return sum ;
    }
    */
      public int maximalSquare(char[][] matrix){
          int m=matrix.length;
          int n=matrix[0].length;
          int max=0;
          int[][]dp=new int[m][n];
          for(int i=0;i<m;i++){
              for(int j=0;j<n;j++){
                  if(i==0 || j==0){
                      if(matrix[i][j]=='1'){
                          dp[i][j]=1;
                      }else{
                          dp[i][j]=0;
                      }
                  }else{
                      if(matrix[i][j]=='1'){
                   dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                      }
                  }
               max=Math.max(dp[i][j],max); 
              }
              
              
          }
          return max*max;
      }
    
}