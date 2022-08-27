class Solution {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        int dp[][][] =new int[prices.length+1][2][k+1];
        for(int i=0;i<prices.length;i++){
            for(int j=0;j<=1;j++){
                dp[i][j][0]=0;
            }
        }
        for(int buy=0;buy<=1;buy++){
            for(int cap=0;cap<=k;cap++){
                dp[n][buy][cap]=0;
            }  
        }
        for(int index=n-1;index>=0;index--){
            for(int buy=0;buy<=1;buy++){
                // here cap starts with 1 because in base case when cap==0 it is already 0
                for(int cap=1;cap<=k;cap++){
                    if(buy==1){
                    dp[index][buy][cap]= Math.max(-prices[index]+dp[index+1][0][cap],0+dp[index+1][1][cap]);
                   }else{
                     dp[index][buy][cap]= Math.max(prices[index]+dp[index+1][1][cap-1],0+dp[index+1][0][cap]);
                  }
                }
            }
        }
       return dp[0][1][k];  
    }
}