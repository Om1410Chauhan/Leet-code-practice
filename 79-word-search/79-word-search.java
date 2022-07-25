class Solution {
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;
        boolean[][] visited=new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               if((word.charAt(0)==board[i][j]) && wordSearch(i,j,word,board,visited,0)){
                   return true;
               }  
            }
        }
        return false;
        
    }
    boolean wordSearch(int i,int j,String word,char[][] board,boolean [][] visited,int index){
        if(word.length()==index){
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || visited[i][j]|| board[i][j]!=word.charAt(index)){
            return false;
        }
        visited[i][j]=true;
        if(wordSearch(i+1,j,word,board,visited,index+1)||wordSearch(i-1,j,word,board,visited,index+1)
          || wordSearch(i,j+1,word,board,visited,index+1) || wordSearch(i,j-1,word,board,visited,index+1) ){
            return true;
        }
        visited[i][j]=false;
        return false;
    }
}