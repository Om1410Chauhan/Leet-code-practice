class Solution {
    public int integerReplacement(int n) {
        if(n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }
        if(n==1){
         return 0;
        }
        HashMap<Integer,Integer> map=new HashMap();
       int  ans=helper(n,map);
        return  ans;
    }
    private int helper(int n,HashMap<Integer,Integer>map){
        if(n==1){
            return 0;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int  ans=0;
        if (n==Integer.MAX_VALUE){
            return helper(n-1,map);
        }
  
        if(n%2==0){
            ans=1+helper(n/2,map);
        }else{
           int  ans1=1+helper(n+1,map);
            int ans2=1+helper(n-1,map);
            ans=Math.min(ans1,ans2);
        }
        map.put(n,ans);
        return ans;
    }
}