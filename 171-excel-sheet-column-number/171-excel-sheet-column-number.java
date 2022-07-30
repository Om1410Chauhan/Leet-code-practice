class Solution {
    public int titleToNumber(String columnTitle) {
        int n=columnTitle.length();
        int ans=0;
        int p=0;
        for(int i=n-1;i>=0;i--){
            char c=columnTitle.charAt(i);
            ans+=(Math.pow(26,p)*(c-'A'+1));
            p++;
        }
        return ans;
    }
}