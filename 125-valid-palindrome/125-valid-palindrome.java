class Solution {
    public boolean isPalindrome(String s) {
        String ans=s.toLowerCase();
        String answer="";
        for(int i=0;i<s.length();i++){
           if(Character.isLetterOrDigit(ans.charAt(i))){
               answer+=ans.charAt(i);
           }else{
               continue;
           }
        }
        int i=0;
        int j=answer.length()-1;
        while(i<=j){
            if(answer.charAt(i)!=answer.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}