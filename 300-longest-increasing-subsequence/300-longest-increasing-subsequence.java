class Solution {
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
}