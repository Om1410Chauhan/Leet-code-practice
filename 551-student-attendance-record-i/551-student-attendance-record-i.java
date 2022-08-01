class Solution {
    public boolean checkRecord(String s) {
        int p=0,l=0,a=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='P'){
                continue;
            }else if(s.charAt(i)=='A' ){
                a++;
            }
            else if(s.contains("LLL")){
               return false;
            }
        }
        if(a>=2)
            return false;
        return true;
    }
}