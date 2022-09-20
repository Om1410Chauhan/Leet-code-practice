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
       int  ans=helper(n);
        return  ans;
    }
    private int helper(int n){
        if(n==1){
            return 0;
        }
        int  ans=0;
        if (n==Integer.MAX_VALUE){
            return helper(n-1);
        }
  
        if(n%2==0){
            ans=1+helper(n/2);
        }else{
           int  ans1=1+helper(n+1);
            int ans2=1+helper(n-1);
            ans=Math.min(ans1,ans2);
        }
        return ans;
    }
}