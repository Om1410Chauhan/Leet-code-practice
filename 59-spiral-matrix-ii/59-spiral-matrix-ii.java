class Solution {
    public int[][] generateMatrix(int n) {
        /*int matrix[][]=new int[n][n];
        int t=0,l=0, r=n-1,b=n-1;
        int d=0;
        
        int k=1;
        
        while(l<=r && t<=b){
            if(d==0){
                for(int i=l;i<=r;i++){
                    matrix[t][i]=k++;
                    }
                d=1;t++;
            }else if(d==1){
                for(int i=t;i<=b;i++){
                    matrix[i][r]=k++;
                }
                d=2;r--;
            }else if(d==2){
                for(int i=r;i>=l;i--){
                    matrix[b][i]=k++;
                }
                d=3;b--;
            }else if(d==3){
                for(int i=b;i>=r;i--){
                    matrix[i][l]=k++;
                }
                d=0;l++;
            }
        }
        return matrix;
        */
     int[][] ret = new int[n][n];
	int left = 0,top = 0;
	int right = n -1,down = n - 1;
	int count = 1;
	while (left <= right) {
		for (int j = left; j <= right; j ++) {
			ret[top][j] = count++;
		}
		top ++;
		for (int i = top; i <= down; i ++) {
			ret[i][right] = count ++;
		}
		right --;
		for (int j = right; j >= left; j --) {
			ret[down][j] = count ++;
		}
		down --;
		for (int i = down; i >= top; i --) {
			ret[i][left] = count ++;
		}
		left ++;
	}
	return ret;
    }
}