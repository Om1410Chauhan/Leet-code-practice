class Solution {
    public int maxSubArray(int[] nums) {
        // by kidane's algorithm
        int current=0;
        int best=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            current=Math.max(nums[i],nums[i]+current);
            best=Math.max(best,current);
        }
        return best;
    }
}