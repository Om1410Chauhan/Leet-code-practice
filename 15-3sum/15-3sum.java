class Solution {
    List<List<Integer>>res=new ArrayList();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            // to prevent duplication of a
            if(i==0 || nums[i-1]!=nums[i]){
                int target=0-nums[i];
                twoSum(i+1,nums.length-1,nums,target);
            }
        }
        return res;
        
    }
    void twoSum(int i,int j,int[] nums,int target){
        int a1=nums[i-1];
        while(i<j){
        if(nums[i]+nums[j]>target){
            j--;
        }else if(nums[i]+nums[j]<target){
            i++;
        }else{
           List<Integer>output=new ArrayList();
            output.add(a1);
            output.add(nums[i]);
            output.add(nums[j]);
            res.add(output);
            while(i<j && nums[i]==nums[i+1]){
                i++;
            }
            while(i<j && nums[j]==nums[j-1]){
                j--;
            }
            i++;
            j--;
        }
     }
    }
}
