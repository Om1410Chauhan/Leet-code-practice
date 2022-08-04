class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] array=new int[s.length()];
        int n=s.length();
        int prev=n;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                array[i]=0;
                prev=0;
            }else{
                array[i]=++prev;
            }
        }
        prev=n;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==c){
                 prev=0;
                 array[i] = Math.min(array[i], 0);
            }else{
                array[i]=Math.min(array[i],++prev);
            }
        }
        return array;
    }
}
   