class Solution {
    public String reverseWords(String s) {
        char[] c=s.toCharArray();
        int i=0,j=0;
        for(;j<c.length;j++){
            if(c[j]==' '){
               reverse(c,i,j-1);
                i=j+1;
            }
        }
        reverse(c,i,j-1);
        String a=new String(c);
        return a;
    }
    void reverse(char[] ch,int i,int j){
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
    }
}