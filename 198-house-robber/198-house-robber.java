class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            dp[i]=-1;
        }
        return memo(nums,dp,0);
    }
    private int memo(int[] nums,int[] dp,int currentIndex){
        if(currentIndex>=nums.length){
            return 0;
        }
        if(dp[currentIndex]!=-1){
            return dp[currentIndex];
        }
        int stealWealth=nums[currentIndex]+memo(nums,dp,currentIndex+2);
        int skipWealth=memo(nums,dp,currentIndex+1);
        dp[currentIndex]=Math.max(stealWealth,skipWealth);
        return Math.max(stealWealth,skipWealth);
    }
}