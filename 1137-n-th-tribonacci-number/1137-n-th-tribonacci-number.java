class Solution {
    public int tribonacci(int n) {
         if(n==0 || n==1 ){ 
         return n;
        }
        if(n==2){
            return 1;
        }
        int dp[]=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return ans(dp,n);
    }
     private int ans(int[] dp,int n){
        if(n==0 || n==1){
            return n;
        }
         if(n==2){
             return 1;
         }
        int ans1,ans2,ans3;
        if(dp[n-1]==-1){
            dp[n-1]=ans(dp,n-1);
            ans1=dp[n-1];
        }else{
            ans1=dp[n-1];
        }
        if(dp[n-2]==-1){
            dp[n-2]=ans(dp,n-2);
            ans2=dp[n-2];
        }else{
            ans2=dp[n-2];
        }
         if(dp[n-3]==-1){
             dp[n-3]=ans(dp,n-3);
             ans3=dp[n-3];
         }else{
             ans3=dp[n-3];
         }
        return ans1+ans2+ans3;
    }
}