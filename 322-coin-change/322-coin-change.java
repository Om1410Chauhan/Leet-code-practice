class Solution {
    // using tabulation
    public int coinChange(int[] coins, int amount) {
        if(amount==0){
            return 0;
        }
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0){
                dp[0][i]=i/coins[0];
            }else{
                dp[0][i]=(int)Math.pow(10,9);
            }
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=amount;j++){
                int nonTake=0+dp[i-1][j];
                int take=Integer.MAX_VALUE;
                   if(coins[i]<=j){
                 // 1 coin taken
                        take=1+dp[i][j-coins[i]];
                    }
                   int min=Math.min(take,nonTake);
                     dp[i][j]=min;
            }
        }
        int ans= dp[n-1][amount];
        if(ans>=(int)Math.pow(10,9)){
            return -1;
        }
        return ans;
    }
    /*
    using memoiazation
    private int helper(int[] coins ,int amount,int index,int[][]dp){
        // we started from n-1 so base case will be at 0
        if(index==0){
            if(amount%coins[0]==0){
                return amount/coins[0];
            }
            return (int)Math.pow(10,9);
            
        }
        if(dp[index][amount]!=0){
            return dp[index][amount];
        }
        // 0 coins taken
        int nonTake=0+helper(coins,amount,index-1,dp);
        int take=Integer.MAX_VALUE;
        if(coins[index]<=amount){
            // 1 coin taken
            take=1+helper(coins,amount-coins[index],index,dp);
        }
        int min=Math.min(take,nonTake);
        return  dp[index][amount]=min;
    }
    */
}