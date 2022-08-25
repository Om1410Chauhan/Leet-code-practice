class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
           int[] array=new int[26];
        for(char ch:magazine.toCharArray()){
            
            array[ch-'a']++;
        }
        for(char ch:ransomNote.toCharArray()){
            if(array[ch-'a']!=0){
                array[ch-'a']--;
            }else if(array[ch-'a']==0){
                return false;
            }
        }
    
    return true;
    }
}