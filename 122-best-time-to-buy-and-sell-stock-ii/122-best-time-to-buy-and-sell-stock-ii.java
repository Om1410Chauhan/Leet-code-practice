class Solution {
    // using memoiazation
    public int maxProfit(int[] prices) {
        // here 2 is can buy or cannot
        int dp[][]=new int[prices.length][2];
        for(int i=0;i<prices.length;i++){
            for(int j=0;j<2;j++){
                dp[i][j]=-1;
            }
        }
        return f(prices,dp,0,1);
        
    }
    private int f(int[] prices,int[][] dp,int index,int buy){
        if(index>=prices.length){
            return 0;
        }
        int profit=0;
            if(dp[index][buy]!=-1){
                return dp[index][buy];
            }
                if(buy==1){
                    profit=Math.max(-prices[index]+f(prices,dp,index+1,0),0+f(prices,dp,index+1,1));
                }else{
                    profit=Math.max(prices[index]+f(prices,dp,index+1,1),0+f(prices,dp,index+1,0));
                }
            dp[index][buy]=profit;
            return profit;
        
        }
}