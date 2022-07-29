class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        if(haystack.length()<needle.length()){
            return -1;
        }
        int m=haystack.length();
        int n=needle.length();
        for(int i=0;i<m;i++){
            int j=0;
            for( ;j<n && (i+j)<haystack.length();j++){
               if(haystack.charAt(i+j)==needle.charAt(j)){
                   continue;
               } else{
                   break;
               }
            }
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }
}