class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        if(dungeon==null || dungeon.length==0 || dungeon[0].length==0){
            return 0;
        }
        int[][] dp=new int[dungeon.length+1][dungeon[0].length+1];
        return helper(dungeon,0,0,dp);
    }
    private int helper(int[][]dungeon,int i,int j,int[][] dp){
        int m=dungeon.length;
        int n=dungeon[0].length;
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        if(i>=m || j>=n){
            return Integer.MAX_VALUE;
        }
        int minHealth=Math.min(helper(dungeon,i+1,j,dp),helper(dungeon,i,j+1,dp));
        if(minHealth==Integer.MAX_VALUE){
            minHealth=1;
        }
        int res=0;
        if(minHealth-dungeon[i][j]>0){
               res=minHealth-dungeon[i][j];
          
        }else{
           res=1;
        }
        dp[i][j]=res;
       return res; 
    }
}