class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> li=new ArrayList();
        boolean[] visited=new boolean[nums.length];
        permuteUniqueR(li,nums,new ArrayList(),visited);
        return li;
    }
    void permuteUniqueR(List<List<Integer>>li,int[] nums,List<Integer>current,boolean[] visited){
        if(current.size()==nums.length){
            if(li.contains(current)){
                return;
            }
            li.add(new ArrayList(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]==true){continue;}
            current.add(nums[i]);
            visited[i]=true;
            permuteUniqueR(li,nums,current,visited);
            current.remove(current.size()-1);
            visited[i]=false;
        }
    }
}