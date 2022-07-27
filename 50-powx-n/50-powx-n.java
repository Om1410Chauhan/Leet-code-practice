class Solution {
    public double myPow(double x, int n) {
       
        return myPowR(x,1L* n);        
    }
    double myPowR(double x,long n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return myPowR(1/x,-n);
        }
        return n%2==0?myPowR(x*x,n/2):x*myPowR(x*x,n/2);
    }
}
