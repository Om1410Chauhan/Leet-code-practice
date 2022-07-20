class Solution {
    public int maxArea(int[] height){
        int width=0;
        int length=0;
        int area=0;
        int maxArea=0;
       int i=0;int j=height.length-1;
        while(i<j){
            width=Math.min(height[i],height[j]);
            length=(j-i);
            area=width*length;
            if(maxArea<area){
                maxArea=area;
            }
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}