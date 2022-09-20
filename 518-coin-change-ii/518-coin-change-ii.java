class Solution {
    public int change(int amount, int[] coins) {
       int n=coins.length;
        int [][] dp=new int[coins.length][amount+1];
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0){
                dp[0][i]=1;
                }
        }
          for(int i=1;i<coins.length;i++){
            for(int j=0;j<=amount;j++){
                int nonTake=0+dp[i-1][j];
                int take=0;
                   if(coins[i]<=j){
                 // 1 coin taken
                        take=dp[i][j-coins[i]];
                    }
                  dp[i][j]=take+nonTake;
            }
        }    
        return dp[n-1][amount];  
    }
}