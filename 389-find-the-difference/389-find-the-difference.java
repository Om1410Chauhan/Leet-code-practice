class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length()==0){
            return t.charAt(0);
        }
        char[] array=new char[26];
        for(char ch:s.toCharArray()){
            array[ch-'a']++;
        }
        char c=s.charAt(0);
        for(char ch:t.toCharArray()){
            if(array[ch-'a']==0){
                return ch;
            }else{
                array[ch-'a']--;
            }
        }
        return c;
    }
}