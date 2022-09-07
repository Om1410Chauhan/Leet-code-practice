// memoiazation time complexity=o(N3)
// space complexity=O(n2+n)
/*
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
        // to copy nums array into nCut array using below function
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
    */
    // using tabulation
    class Solution {
         public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] nCuts = new int[n + 2];         // creating a new array of size n+2
        nCuts[0] = 1;                         // inserting 1 at the front  
        nCuts[n + 1] = 1;                     //inserting 1 at the back
        System.arraycopy(nums, 0, nCuts, 1, n);
        
        //int dp[][] = new int[n+1][n+1];
       // return f(1,n,nCuts,dp);
        int dp[][] = new int[n+2][n+2]; //for tabulation
        
        for(int i=n;i>=1;i--){
            for(int j =1;j<=n;j++){
                 if(i>j) continue;
                 int maxi = Integer.MIN_VALUE;
                 for(int ind =i;ind <= j;ind++){
                     int cost = nCuts[i-1] * nCuts[ind] * nCuts[j+1] + dp[i][ind-1] + dp[ind+1][j];
                     maxi= Math.max(cost,maxi);
            
                 }
                 dp[i][j] =  maxi;
            }
        }
        return dp[1][n];
         }}