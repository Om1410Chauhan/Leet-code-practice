class Solution {
    /*
    public int numSquares(int n) {
        if(n==0){
            return 0;
        }
        int[] dp=new int[n+1];
        
        return helper(n,dp);
    }
    private int helper(int n,int[] dp){
        if(n==0){
            return 0;
        }
        if(n<0){
            return Integer.MAX_VALUE;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int min=n;
        for(int i=1;i<=n;i++){
            min=Math.min(helper(n-(i*i),dp),min);
            
        }
        dp[n]=min+1;
        return min+1;
        */ 
    // using tabulation
    // here time complexity n*under root of n;
    // here with value i we iterated over all values till n
    // we used j to find min number of numbers required to sum==8;
    public int numSquares(int n) {
        if(n==0){
            return 0;
        }
        int[] dp=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            dp[i]=n;
            for(int j=1;j*j<=i;j++){
            dp[i]=Math.min(dp[i],dp[i-(j*j)]+1);
            }
        }
        return dp[n];
    }
}