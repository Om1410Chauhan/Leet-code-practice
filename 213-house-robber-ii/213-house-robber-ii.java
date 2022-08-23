class Solution {
    public int rob(int[] nums) {
      int n=nums.length;
        int array1[]=new int[n];
        int[] array2=new int[n];
        if(n==1){
            return nums[0];
        }
        for(int i=0;i<n;i++){
            if(i!=0){
                array1[i]=nums[i];
            }
            if(i!=n-1){
                array2[i]=nums[i];
            }
        }
        return Math.max(helper(array1),helper(array2));
    }
    private int helper(int[] array){
        int n=array.length;
        int prev=array[0];
        int prev2=0;
        for(int i=0;i<n;i++){
            int take=array[i];
            if(i>1){
                take+=prev2;
            }
            int skip=0+prev;
            int current=Math.max(take,skip);
            prev2=prev;
            prev=current;
        }
        return prev;
    }
}