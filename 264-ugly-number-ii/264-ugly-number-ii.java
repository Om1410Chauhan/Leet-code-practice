class Solution {
    public int nthUglyNumber(int n) {
       int[] dp=new int [n+1]; 
        dp[1]=1;
        int p2=1;
        int p3=1;
        int p5=1;
        for(int i=2;i<=n;i++){
            int ans1=dp[p2]*2;
            int ans2=dp[p3]*3;
            int ans3=dp[p5]*5;
            int min=Math.min(ans1,Math.min(ans2,ans3));
            dp[i]=min;
            if(ans1==min){
                p2++;
            }
            if(min==ans2){
                p3++;
            }
            if(min==ans3){
                p5++;
            }
            
         }
        return dp[n];
    }
}