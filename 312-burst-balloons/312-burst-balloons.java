class Solution {
    public int maxCoins(int[] nums) {
       int n=nums.length;
        if(n==1){
            return nums[0];
        }
        // using memoiazation
        // we initiallised dp array with n+1 size because balloons start from 1 to N
        // so when dp array demand value of dp[5][5] we need dp[n+1][n+1]
        int[][] dp=new int[n+1][n+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j]=-1;
            }
        }
        int[] nCut=new int[n+2];
        // for initiallising value 1 to array out of bound condition
        nCut[0]=1; // inserting 1 at -1 index
        nCut[n+1]=1;  // index 1 at n+1 index
        System.arraycopy(nums,0,nCut,1,n);
        int i=1; 
        int j=n;
        return memo(i,j,nCut,dp);
    }
    private int memo(int i,int j,int[]nums,int[][]dp){
        // when array is empty
        if(i>j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int maxi=Integer.MIN_VALUE;
        for(int index=i;index<=j;index++){
            // we take i-1 and j+1 beacuse we are going from bootom to up that means balloon bursted in last to up
            int ans=nums[i-1]*nums[index]*nums[j+1]+memo(i,index-1,nums,dp)+memo(index+1,j,nums,dp);
            maxi=Math.max(maxi,ans);
        }
        return dp[i][j]=maxi;
    }
}