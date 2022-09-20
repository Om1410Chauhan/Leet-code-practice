class Solution {
    public int minSteps(int n) {
        if(n==1){
            return 0;
        }
        // this is to find number of A's we have right now
        int current=1;
        // buffer is used to define number of  A's we have copied
        int buffer=0;
        // count is answer i.e number of steps
        int count=0;
        while(current<n){
            // rest is number of A's left
            int rest=n-current;
            // if part is for CP
            
            if(rest%current==0){
                buffer=current;
                current+=buffer;
                count+=2;
                // else is for only PASTE
            }else{
                
                current+=buffer;
                count++;
                
            }
        }
        return count;
        
    }
}