class Solution {
    public boolean canJump(int[] nums) {
        int range=0;
        int i=0;
        for(;i<=range;i++){
            range=Math.max(range,nums[i]+i);
            if(range>=nums.length-1){
                return true;
            }
        
            
        }
        return false;
    }
}