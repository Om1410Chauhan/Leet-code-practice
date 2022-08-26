class Solution {
    public int numDecodings(String s) {
      // using memoiazation
        int n=s.length();
        int dp[]=new int[n+1];
        int ways=numberOfWays(s,0,dp);
        return ways;
    }
    private int numberOfWays(String s,int index,int[] dp){
        if(index==s.length()){
            return 1;
        }
      
        if(s.charAt(index)=='0'){
            return 0;
        }
          if(index==s.length()-1){
            return 1;
        }
        if(dp[index]!=0){
            return dp[index];
        }
        int way1=numberOfWays(s,index+1,dp);
        int way2=0;
        if(Integer.parseInt(s.substring(index,index+2))<=26){
            way2=numberOfWays(s,index+2,dp);
        }
        dp[index]=way1+way2;
        return way1+way2;
    }
}