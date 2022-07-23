class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
      List<List<Integer>> li=new ArrayList();
      twoSum(0,nums,new ArrayList(),li);
        return li;
    }
    void twoSum(int start,int[]nums,List<Integer>current,List<List<Integer>>li){
        li.add(new ArrayList(current));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]){
                continue;
            }
            current.add(nums[i]);
            twoSum(i+1,nums,current,li);
            current.remove(current.size()-1);
        }
    }
}