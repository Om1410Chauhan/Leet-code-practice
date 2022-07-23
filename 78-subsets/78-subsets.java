class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> li=new ArrayList();
        li.add(new ArrayList());
        for(int i=0;i<n;i++){
            int k=li.size();
            for(int j=0;j<k;j++){
                List<Integer>current=new ArrayList(li.get(j));
                current.add(nums[i]);
                li.add(current);
            }
        }
        return li;
  }
        
    }