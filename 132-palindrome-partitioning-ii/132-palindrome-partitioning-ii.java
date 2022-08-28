class Solution {
    public int minCut(String s) {
        /*
        if(s.length()==1){
            return 0;
        }
        int n=s.length();
        // here dp is stating number of ways to divide string if we start at its index.
        int[] dp=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        int mincut=f(0,dp,s)-1;
        return mincut;
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
    */
  
    
        // using tabulation
        
        if(s.length()==1){
            return 0;
        }
        int n=s.length();
        int[] dp=new int[n+1];
        dp[n]=0;
        for(int i=n-1;i>=0;i--){
           String temp="";
           int min=Integer.MAX_VALUE;
           for(int j=i;j<s.length();j++){
             temp+=s.charAt(j);
                if(isPalindrome(temp)){
                  int cost=1+dp[j+1];
                  min=Math.min(min,cost);
                } 
            }
           dp[i]=min; 
        }
        return dp[0]-1;
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