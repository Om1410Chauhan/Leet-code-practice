class Solution {
        /*
    // using memoiazation
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int[][] dp=new int[nums.length][nums.length+1];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length+1;j++){
                dp[i][j]=-1;
            }
        }
        return helper(nums,dp,0,-1);
    }
    private int helper(int[] nums,int[][]dp,int index,int prev){
        if(index==nums.length){
            return 0;
        }
        // index goes from 0 to n-1 i.e n times
        // prev goes from -1 to n-1 i.e n+1 times
        // prev+1 beacuse initially we take prev=-1 and -1 is a non valid index
        if(dp[index][prev+1]!=-1){
            return dp[index][prev+1];
        }
        int take=0;
        if(prev==-1 || nums[index]>nums[prev]){
            take=1+helper(nums,dp,index+1,index);
        }
        int nonTake=0;
        nonTake=0+helper(nums,dp,index+1,prev);
        return dp[index][prev+1]=Math.max(take,nonTake);
        
    }
    */
    
    // using tabulation
    /*
    public int lengthOfLIS(int[] nums){
        int n=nums.length;
        // n+1 for index becaus we are assigning dp[n][n+1]==0
        int dp[][]=new int[n+1][n+1];
        // index goes from 0 to n-1
        // prev goes from -1 to n-1
        for(int current=n-1;current>=0;current--){
            // we can write n-1 but as we know prev is always 1 less than current
            for(int prev=current-1;prev>=-1;prev--){
                       int take=0;
                       if(prev==-1 || nums[current]>nums[prev]){
                           // in prev current+1 beacuse we have to change co-ordinate of previous
                         take=1+dp[current+1][current+1];
                      }
                     int nonTake=0;
                // here we do prev+1 beacuse -1 doesn't exsist
                       nonTake=0+dp[current+1][prev+1];
                      dp[current][prev+1]=Math.max(take,nonTake);
            }
        }
        // we returned dp[n-1][-1] because we started from 0 and -1 
        // and in current we do -1+1 beacuse -1 doesn't exsist so we have to do +1
        return dp[0][-1+1];

    }
    */
    // space optimised solution
     public int lengthOfLIS(int[] nums){
         int n=nums.length;
         int[] next=new int[n+1];
         int[] curr=new int[n+1];
         
          for(int current=n-1;current>=0;current--){
            // we can write n-1 but as we know prev is always 1 less than current
            for(int prev=current-1;prev>=-1;prev--){
                       int take=0;
                       if(prev==-1 || nums[current]>nums[prev]){
                           // in prev current+1 beacuse we have to change co-ordinate of previous
                         take=1+next[current+1];
                      }
                     int nonTake=0;
                // here we do prev+1 beacuse -1 doesn't exsist
                       nonTake=0+next[prev+1];
                      curr[prev+1]=Math.max(take,nonTake);
            }
              next=curr;
        }
         return next[-1+1];
        
    }
}