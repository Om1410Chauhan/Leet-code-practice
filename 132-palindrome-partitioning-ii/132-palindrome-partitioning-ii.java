class Solution {
    public int minCut(String s) {
        if(s.length()==1){
            return 0;
        }
        int n=s.length();
        // here dp is stating number of ways to divide string if we start at its index.
        int[] dp=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        int mincut=f(0,dp,s);
        return mincut-1;
    }
    private int f(int i,int[] dp,String s){
        if(i==s.length()){
            // 0 because if we reach the end of string than it can't be divided
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        String temp="";
        int min=Integer.MAX_VALUE;
        for(int j=i;j<s.length();j++){
              temp+=s.charAt(j);
            if(isPalindrome(temp)){
                int cost=1+f(j+1,dp,s);
                min=Math.min(min,cost);
            }
           
        }
        return  dp[i]=min;
    }
    private boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}