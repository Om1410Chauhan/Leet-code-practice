class Solution {
    // i this question we have to recognise a pattern
    // the pattern is that for even numbers number of 1 is qual to n/2
    // and for odd it is 1+n/2;
    public int[] countBits(int n) {
        // using memoiazation
        /*
        int [] ans=new int[n+1];
        int[] dp=new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=helper(i,dp);
        }
        return ans;
    }
    private int helper(int n,int[] dp){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n%2==0){
            return dp[n]=helper(n/2,dp);
        }else{
            return dp[n]=1+helper(n/2,dp);
        }
    }
    */
        // using tabulation
         int [] ans=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            ans[i]=ans[i/2]+i%2;
        }
        return ans;
}
}