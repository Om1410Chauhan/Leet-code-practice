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
    }
}