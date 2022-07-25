class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> li=new ArrayList();
        boolean[] visited=new boolean[nums.length];
        combination(li,visited,nums,new ArrayList());
        return li;
    }
    void combination(List<List<Integer>> li,boolean[] visited,int[] nums,List<Integer> current){
        if(current.size()==nums.length){
            li.add(new ArrayList(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]==true){
                continue;
            }
                current.add(nums[i]);
                visited[i]=true;
                combination(li,visited,nums,current);
                current.remove(current.size()-1);
                visited[i]=false;
        }
    }
}