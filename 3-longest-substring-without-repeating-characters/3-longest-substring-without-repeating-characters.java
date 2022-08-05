class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,max=0;
        HashSet<Character> set=new HashSet();
        while(j<s.length()){
            char c=s.charAt(j);
            if(set.add(c)){
                max=Math.max(max,j-i+1);
                j++;
            
            }else{
                while(s.charAt(i)!=c){
                     set.remove(s.charAt(i));
                    i++;
                }
                set.remove(c);
                i++;
             }
      }
               return max;
   }        
}