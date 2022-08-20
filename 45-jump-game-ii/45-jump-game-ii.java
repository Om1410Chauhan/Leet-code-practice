class Solution {
    // using greedy algorithm
    public int jump(int[] nums) {
        int jump=0;
        int farthest=0;
        int current=0;
        for(int i=0;i<nums.length-1;i++){
            farthest=Math.max(farthest,i+nums[i]);
            if(i==current){
                current=farthest;
                jump++;
            }
        }
        return jump;
    }
}