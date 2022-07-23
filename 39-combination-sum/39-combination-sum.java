class Solution {
    List<List<Integer>> comb= new ArrayList();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       
       /*or(int i=0;i<n;i++){
            int a=candidates[i];
            twoSum(candidates,target,a);
        }
        return li;
    }
    void twoSum(int[] candidates,int target,int a){
        List<Integer>data=new ArrayList();
        if(a==target){
            data.add(a);
            li.add(data);
        }
        int i=0int j=candidates.length-1;
        while(i<=j){
            if(candidates[i]+candidates[j]+a>target){
                j--;
            }else if(candidates[i]+candidates[j]+a<target){
                i++;
            }else{
                data.add(a);
                data.add(candidates[i]);
                data.add(candidates[j]);
                li.add(data);
                i++;
                j--;
            }
        }
        */
         int n=candidates.length;
        twoSumCombination(0,candidates,target,new ArrayList(),comb);
        return comb;

    }
    void twoSumCombination(int start,int[] candidates,int target ,List<Integer>current,List<List<Integer>> comb){
     if(target==0){
         comb.add(new ArrayList(current));
         }
      if(target<0){
           return;
       }
       for(int i=start;i<candidates.length;i++){
           current.add(candidates[i]); // to add numbers of at value i
           twoSumCombination(i,candidates,target-candidates[i] ,current,comb); // to call funtion recursively so // that ther numbers are added
           current.remove(current.size()-1);  // to remove last element from the current list if number isn't //have any pair equal to target  
       }
 }
    
    
}