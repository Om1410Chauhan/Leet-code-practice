class Solution {
    public boolean isPalindrome(int x) {
        Integer obj=new Integer(x);
       String s=obj.toString();
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
        
    }
}