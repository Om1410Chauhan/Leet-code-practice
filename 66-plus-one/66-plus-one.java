class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        if(n==0){
            return new int[]{ };
        }
         for(int i=n-1;i>=0;i--){
             int count=1;
             digits[i]+=count;
             if(digits[i]<=9){
                 return digits;
             }
             digits[i]=0;
            
         }
         int[] res=new int[n+1];
             res[0]=1;
             return res;
    }
}