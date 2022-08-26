class Solution {
    public int numDecodings(String s) {
        /*
      // using memoiazation
        int n=s.length();
        // here dp array tells us the way to decode the character at index by how many times
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
        */
        // using tabulation
         int n=s.length();
        // here every index of dp teels us ways to decode a string having length==index
        
        int dp[]=new int[n+1];
        if(s.charAt(0)=='0' || s.length()==0){
            return 0;
        }
        // here dp[0]=1 for the empty strings
        dp[0]=1;
        // and dp[1]=1 if it isn't==0
        dp[1]=s.charAt(0)!=0?1:0;
        for(int i=2;i<n+1;i++){
            int first=Integer.valueOf(s.substring(i-1,i));
            int second=Integer.valueOf(s.substring(i-2,i));
            if(first>=1 && first<=9){
                dp[i]+=dp[i-1];
            }
            if(second>=10 && second<=26){
                dp[i]+=dp[i-2];
            }
        }
        return dp[n];
    }
}