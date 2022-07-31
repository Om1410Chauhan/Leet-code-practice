class Solution {
    public int countSegments(String s) {
        if(s.length()==0){
            return 0;
        }
        int index=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' ')){
                index++;
            }
            i++;
        }
        return index;
        
    }
}