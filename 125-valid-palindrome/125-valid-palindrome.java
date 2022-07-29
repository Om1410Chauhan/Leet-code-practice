class Solution {
    public boolean isPalindrome(String s) {
        if(s==null){
            return false;
        }
        String ans=s.toLowerCase();
        String answer="";
         int i=0;
        int j=ans.length()-1;
        while(i<j){
            while(i<j && !((ans.charAt(i)>='a' && ans.charAt(i)<='z')|| (ans.charAt(i)>='0'&& ans.charAt(i)<='9'))){
                i++;
            }
                        while(i<j && !((ans.charAt(j)>='a' && ans.charAt(j)<='z')|| (ans.charAt(j)>='0'&& ans.charAt(j)<='9'))){
                            j--;
                        }
            if(ans.charAt(i)!=ans.charAt(j)){
                return false;
            }
            i++;
            j--;
            
            
        }
        return true;
    }
}