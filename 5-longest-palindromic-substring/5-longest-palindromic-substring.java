class Solution {
    public String longestPalindrome(String s) {
       int start=0,end=0;
        for(int i=0;i<s.length();i++){
            int len1=expand(i,i,s);
            int len2=expand(i,i+1,s);
            int len=Math.max(len1,len2);
            if(end-start<len){
                start=i-(len-1)/2;
                end=i+len/2;
            }
            
        }
        return s.substring(start,end+1);
    }
    private int expand(int i,int j,String s){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return j-i-1; 
    }
}
