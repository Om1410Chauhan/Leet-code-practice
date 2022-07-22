class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
         int n=nums.length;
        int sum=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            int lo=i+1;
            int high=nums.length-1;
            while(lo<high){
                int sum2=nums[i]+nums[lo]+nums[high];
                if(sum2>target)high--;
                else{
                    lo++;
                }
                if(Math.abs(sum-target)>Math.abs(sum2-target)){
                    sum=sum2;
                }
            }
        }
        return sum;
    }
}