class Solution {
    public String intToRoman(int num) {
        /* as we need convert integer into roman we need two array one who store the int value and other will     store the char value*/
        String[] data={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] numericValue={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<data.length;i++){
            // we used while loop beacuse in some inputs like 3 we have to traverse thrice on I value.
            while(numericValue[i]<=num){
                num=num-numericValue[i];
                ans.append(data[i]);
                
             }
        }
        // as we need to return string we return data of stringbuilder object using toZString function
        return ans.toString();
    }
}