class Solution {
    public int minCostClimbingStairs(int[] cost) {
       int[] dp=new int[cost.length];
        int n=cost.length;
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<cost.length;i++){
            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        // to check which value is min either the way we take from i=0 or i=1
        return Math.min(dp[n-1],dp[n-2]);
    }
}