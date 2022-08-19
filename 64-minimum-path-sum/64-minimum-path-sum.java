class Solution {
    /*
        // using recursion
    public int minPathSum(int[][] grid) {
        if(grid.length==0 ){
            return 0;
            }
        return minSum(0,0,grid);
    }
    int minSum(int si,int sj,int[][]grid){
        int er=grid.length-1;
        int ec=grid[0].length-1;
        if(si==er && sj==ec){
            return grid[si][sj];
        }
        if(si>er || sj>ec){
            return Integer.MAX_VALUE;
        }
        int ans1=minSum(si+1,sj,grid);
        int ans2=minSum(si,sj+1,grid);
        return grid[si][sj]+Math.min(ans1,ans2);    

    }
    */
      public int minPathSum(int[][]grid){
        if(grid.length==0){
            return 0;
        }
          HashMap<String,Integer> map=new HashMap();
           return memo(0,0,grid,map);
      }
    int memo(int si,int sj,int[][]grid,HashMap<String,Integer> map){
        int er=grid.length-1;
        int ej=grid[0].length-1;
         if(si==er && sj==ej){
            return grid[si][sj];
        }
        if(si>er || sj>ej){
            return Integer.MAX_VALUE;
        }
        String s=si+"#"+sj;
        if(map.containsKey(s)){
            return map.get(s);
        }
        int ans1=memo(si+1,sj,grid,map);
        int ans2=memo(si,sj+1,grid,map);
        map.put(s,grid[si][sj]+Math.min(ans1,ans2));
        return grid[si][sj]+Math.min(ans1,ans2);
        
    }
    
}