class Solution {
    public boolean isPowerOfTwo(int n) {
        
          return powerOfTwo(n, 1);
    }
    
    public boolean powerOfTwo(long targetNumber, long currentNumber){
        if(targetNumber == currentNumber) return true;
        if(currentNumber > targetNumber) return false;
        
        return powerOfTwo(targetNumber, currentNumber * 2);
    }
}