/*
class Solution {
    public int minDistance(String word1, String word2) {
        
        int n1=word1.length();
        int n2=word2.length();
        int i=n1-1;
        int j=n2-1;
        int[][] dp=new int[n1][n2];
        return helper(i,j,word1,word2,dp);
    }
    int helper(int i,int j,String word1,String word2,int[][] dp){
       if(i<0){
           return j+1;
       }
        if(j<0){
            return i+1;
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        if(word1.charAt(i)==word2.charAt(j)){
            return 0+helper(i-1,j-1,word1,word2,dp);
        }
        
       return dp[i][j]=1+ Math.min(helper(i-1,j,word1,word2,dp),Math.min(helper(i,j-1,word1,word2,dp),helper(i-1,j-1,word1,word2,dp)));
       */
        
class Solution {
    public int minDistance(String word1, String word2) {
           // using tabulation
        int n1=word1.length();
        int n2=word2.length();
        int[][] dp=new int[n1+1][n2+1];
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=i;
        }
        for(int i=1;i<dp.length;i++){
            dp[i][0]=i;
        }
        
        for(int i=1;i<n1+1;i++){
            for(int j=1;j<n2+1;j++){
              if(word1.charAt(i-1)==word2.charAt(j-1)){
                 dp[i][j]= 0+dp[i-1][j-1];
               }else{
                  dp[i][j]=1+ Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                }
              }
         }
        return dp[n1][n2];
    }
}