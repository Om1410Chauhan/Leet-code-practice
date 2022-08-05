class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int size=0;
        int j=s.length()-1;
        for(;j>=0;j--){
            if(s.charAt(j)!=' '){
                size++;
            }else{
                break;
            }
        }
        return size;
    }
}