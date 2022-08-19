class Solution {
    int ans(int[] dp,int n){
        if(n==0 || n==1){
            return n;
        }
        int ans1,ans2;
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
        return ans1+ans2;
    }
    public int fib(int n) {
        if(n==0 || n==1){ 
         return n;
        }
        int dp[]=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return ans(dp,n);
    }
}