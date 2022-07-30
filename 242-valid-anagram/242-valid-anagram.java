class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        if(s.length()==0 || t.length()==0){
            return false;
        }
        char[] array=new char[26];
        for(char c:s.toCharArray()){
            array[c-'a']++;
        }
        for(char c:t.toCharArray()){
           if( array[c-'a']==0){
                return false;
            }else{
               array[c-'a']--;
           }
        }
        return true;
    }
}