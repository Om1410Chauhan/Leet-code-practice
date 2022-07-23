class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // using backtracking
        int n=nums.length;
        List<List<Integer>> li=new ArrayList();
        twoSum(0,nums,li,new ArrayList());
        return li;
    }
    void twoSum(int start,int[] nums,List<List<Integer>> li,List<Integer> current){
        li.add(new ArrayList(current));
        for(int i=start;i<nums.length;i++){
            current.add(nums[i]);
            twoSum(i+1,nums,li,current);
            current.remove(current.size()-1);
        }
    }
}