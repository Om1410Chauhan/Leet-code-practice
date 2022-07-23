class Solution {
    List<List<Integer>> li=new ArrayList();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        twoSumCombination(0,candidates,target,new ArrayList());
        return li;
    }
    void twoSumCombination(int start,int[] candidates,int target,List<Integer> current){
        if(target==0){
            li.add(new ArrayList(current));
        }
        if(target<0){
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1]){
                continue;
            }
            current.add(candidates[i] );
            twoSumCombination(i+1,candidates,target-candidates[i],current);
            current.remove(current.size()-1);
        }
    }
}