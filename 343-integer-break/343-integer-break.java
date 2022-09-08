class Solution {
    public int integerBreak(int n) {
        int dp[]=new int[n+1];
        return helper(n,dp);
    }
    private int helper(int n,int[] dp){
         if(n<2){
             return 0;
         }
        if(n==2){
            return 1;
        }
        if(dp[n]>0){
            return dp[n];
        }
        int max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){// here we check that we get max by dividing the number further or not dividing it
            int ans=Math.max(helper(n-i,dp),n-i);
            max=Math.max(max,ans*i);
        }
        dp[n]=max;
        return max;
    }
}