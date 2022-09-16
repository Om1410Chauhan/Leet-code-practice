class Solution {
public:
    int countNumbersWithUniqueDigits(int n) {
          if(n==0)return 1;
        // for one digit number the answer is 10;
        int ans=10;
        int start=9;
        int current=9;
        while(n>1 && start!=0){
            current*=(start--); // current=81*8;
            ans+=current;// 10+9*9+9*9*8=91+648=789
            n--;
        }
       return ans; 
    }
};