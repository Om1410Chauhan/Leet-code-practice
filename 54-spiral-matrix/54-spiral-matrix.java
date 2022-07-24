class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>li=new ArrayList();
        if(matrix.length==0){
            return li;
        }
        int row=matrix.length;
        int col=matrix[0].length;
        int t=0,b=row-1,r=col-1,l=0;
        int d=0;
        while(t<=b && l<=r){
            if(d==0){
                for(int i=l;i<=r;i++){
                    li.add(matrix[t][i]);
                }
                d=1;t++;
            }else if(d==1){
                for(int i=t;i<=b;i++){
                    li.add(matrix[i][r]);
                }
                d=2;r--;
            }else if(d==2){
                for(int i=r;i>=l;i--){
                    li.add(matrix[b][i]);
                }
                d=3;b--;
            }else if(d==3){
                for(int i=b;i>=t;i--){
                    li.add(matrix[i][l]);
                }
                d=0;l++;
            }
        }
        return li;
    }
}