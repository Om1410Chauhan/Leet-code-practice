class Solution {
    public int maximalRectangle(char[][] matrix) {
          if(matrix.length==0){
            return 0;
        }
        int max=0;
        int[] height=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix[0].length;j++){
              if(matrix[i][j]=='0'){
                 height[j]=0; 
              }else{
                  height[j]+=1;
              }
           
          }  
               max=Math.max(max,findHeight(height));
        }
        return max;
    }
    private int findHeight(int[] height){
         int max=0;
        int n=height.length;
        Stack<Integer> stack=new Stack();
        stack.push(0);
       
        for(int i=1;i<n;i++){
            int current=height[i];
            if(stack.isEmpty() ||  current>=height[stack.peek()]){
                stack.push(i);
            }else{
                while(!stack.isEmpty() && current<height[stack.peek()]){
                    int temp=height[stack.pop()];
                    if(stack.isEmpty()){
                        max=Math.max(max,temp*i);
                    }else{
                        max=Math.max(max,temp*(i-stack.peek()-1));
                    }
                }
                stack.push(i);
            }
        }
        if(!stack.isEmpty()){
             while(!stack.isEmpty()){
                    int i=height.length;
                    int temp=height[stack.pop()];
                    if(stack.isEmpty()){
                        max=Math.max(max,temp*i);
                    }else{
                        //to understand take example and draw histograph
                        max=Math.max(max,temp*(i-stack.peek()-1));
                    }
                }
        }
        return max;
    }
}