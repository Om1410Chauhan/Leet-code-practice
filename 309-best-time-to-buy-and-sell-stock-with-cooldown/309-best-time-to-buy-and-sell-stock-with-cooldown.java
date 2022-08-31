class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        if(prices.length==1){
            return 0;
        }
        int[][] dp=new int[prices.length+1][2];
        for(int i=0;i<prices.length+1;i++){
            for(int j=0;j<=1;j++){
                dp[i][j]=-1;
            }
        }
        return helper(prices,dp,1,0);
    }
    private int helper(int[] prices,int[][]dp,int buy,int index){
        int profit=0;
        if(index>=prices.length){
            return 0;
        }
        if(dp[index][buy]!=-1){
            return dp[index][buy];
        }
            if(buy==1){
                profit=Math.max(-prices[index]+helper(prices,dp,0,index+1),0+helper(prices,dp,1,index+1));
            }else{
                profit=Math.max(prices[index]+helper(prices,dp,1,index+2),0+helper(prices,dp,0,index+1));
            }
        dp[index][buy]=profit;
        return profit;
    }
}