
        /*
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
    */
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(prices.length==0 || prices.length==1){
            return 0;
        }
        int[][]dp=new int[prices.length+2][2];
        dp[prices.length][0]=0;
        dp[prices.length][1]=0;
        for(int i=n-1;i>=0;i--){
            for(int buy=0;buy<=1;buy++){
                if(buy==1){
                  dp[i][1]=Math.max(-prices[i]+dp[i+1][0],0+dp[i+1][1]);
                }
                 if(buy==0){
                dp[i][0]=Math.max(prices[i]+dp[i+2][1],0+dp[i+1][0]);
                 }
            }
        }
        return  dp[0][1];
      }
}
 /*for(int ind = n-1 ; ind>= 0 ; ind--)
        {
            dp[ind][1] = Math.max(-prices[ind]+dp[ind+1][0] , dp[ind+1][1]);
            dp[ind][0] = Math.max(prices[ind]+dp[ind+2][1] , dp[ind+1][0]);
        }
        */