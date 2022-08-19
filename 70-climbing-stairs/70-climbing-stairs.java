class Solution {
    // using memoization
    int ans(int n,int[] dp){
       if(n<=1){
           return 1;
       }
        int ans1,ans2;
       if(dp[n]==-1){
           ans1=ans(n-1,dp);
           ans2=ans(n-2,dp);
           dp[n]=ans1+ans2;
           return dp[n];
       }else{
           return dp[n];
       }
    }
    public int climbStairs(int n) {
       if(n<=1){
           return 1;
       }
       int[] dp=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
       return ans(n,dp); 
    }
}