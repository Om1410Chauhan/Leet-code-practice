class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int difference=target-num;
            
            if(map.containsKey(difference)){
                int index=map.get(difference);
                if(index==i){
                    continue;
                }
                return new int[]{i,index};
            }
        }
        return new int[]{};
    }
}