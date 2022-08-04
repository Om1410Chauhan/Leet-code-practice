class Solution {
    String function(String s){
        char[] array1=s.toCharArray();
        
        String[] array3={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."   };
          String newS=new String();
        for(int i=0;i<array1.length;i++){
          
            newS+=array3[array1[i]-'a'];
        }
        return newS;
    }
    public int uniqueMorseRepresentations(String[] words) {
        if(words.length==0){
            return 0;
        }
        String[] array=new String[words.length];
        for(int i=0;i<words.length;i++){
            array[i]=function(words[i]);
        }
        int diff=1;
        Arrays.sort(array);
        for(int i=1;i<words.length;i++){
            if(array[i].equals(array[i-1])){
                continue;
            }else{
                diff++;
            }
        }
         return diff;
    }
   
}