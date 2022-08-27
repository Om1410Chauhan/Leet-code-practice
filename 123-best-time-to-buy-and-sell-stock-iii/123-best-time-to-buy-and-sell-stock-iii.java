class Solution {
    public int maxProfit(int[] prices) {
        /*
        // 2 is for buy or not and 3 is for how many transaction 2,1,0
        // N*2*3
        // tc=N*2*3;
        //Space complexity=N*2*3;
        int dp[][][]=new int[prices.length][2][3];
        return memo(prices,dp,0,1,2);
    }
    private int memo(int[] prices,int[][][]dp,int index,int buy,int cap){
        if(index==prices.length){
            return 0;
        }
        if(cap==0){
            return 0;
        }
        int profit=0;
        if(dp[index][buy][cap]!=0){
            return dp[index][buy][cap];
        }
        if(buy==1){
            return dp[index][buy][cap]= Math.max(-prices[index]+memo(prices,dp,index+1,0,cap),0+memo(prices,dp,index+1,1,cap));
        }
    
        return dp[index][buy][cap]= Math.max(prices[index]+memo(prices,dp,index+1,1,cap-1),0+memo(prices,dp,index+1,0,cap));
        */
        
        // by tabulation
        int n=prices.length;
        int dp[][][] =new int[prices.length+1][2][3];
        for(int i=0;i<prices.length;i++){
            for(int j=0;j<=1;j++){
                dp[i][j][0]=0;
            }
        }
        for(int buy=0;buy<=1;buy++){
            for(int cap=0;cap<=2;cap++){
                dp[n][buy][cap]=0;
            }  
        }
        for(int index=n-1;index>=0;index--){
            for(int buy=0;buy<=1;buy++){
                // here cap starts with 1 because in base case when cap==0 it is already 0
                for(int cap=1;cap<=2;cap++){
                    if(buy==1){
                    dp[index][buy][cap]= Math.max(-prices[index]+dp[index+1][0][cap],0+dp[index+1][1][cap]);
                   }else{
                     dp[index][buy][cap]= Math.max(prices[index]+dp[index+1][1][cap-1],0+dp[index+1][0][cap]);
                  }
                }
            }
        }
       return dp[0][1][2]; 
    }
}