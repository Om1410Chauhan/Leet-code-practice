class Solution {
    /*
    int function(char c){
        if(c=='L'){
            return -1;
        }else if(c=='U'){
            return 1;
        }else if(c=='R'){
            return 1;
        }else if(c=='D'){
            return -1;
        }
        return 0;
    }
    public boolean judgeCircle(String moves) {
        if(moves.length()==0){
            return false;
        }
        char[] array=moves.toCharArray();
        int x=0;
        int y=0;
        int n=array.length;
        for(int i=0;i<n;i++){
            if(array[i]=='U'|| array[i]=='D'){
            int a=function(array[i]);
            x+=a;
            }else if(array[i]=='L'|| array[i]=='R'){
                int b=function(array[i]);
                y+=b;
            }
        }
        if(x==0 && y==0){
            return true;
        }
        return false;
*/
    public boolean judgeCircle(String moves){
       int l=0,u=0,r=0,d=0;
        char[] array=moves.toCharArray();
        for(char c:array){
            switch(c){
                case 'U':{u++;
                          break;
                         }
                case 'D':{
                    d++;
                    break;
                    }
                case 'R':{
                    r++;
                    break;
                }    
                case 'L':{
                    l++;
                    break;
                }    
            }
          
            
        }
          if(l==r  && u==d){
                return true;
            }
            return false;
    }
}