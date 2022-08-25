class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] leftMax=new int[n];
        int[] rightMax=new int[n];
        int max=height[0];
        leftMax[0]=height[0];
        
        for(int i=1;i<n;i++){
            max=Math.max(max,height[i]);
            leftMax[i]=max;
        }
        max=height[n-1];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            max=Math.max(max,height[i]);
            rightMax[i]=max;
        }
        int res=0;
        for(int i=0;i<n;i++){
            res+=(Math.min(leftMax[i],rightMax[i])-height[i]);
        }
        return res;
    }
}