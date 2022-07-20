class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int k=1;
        int a=candyType.length;
        int n=candyType.length/2;
        for(int i=1;i<a;i++){
            if(candyType[k-1]!=candyType[i]){
                candyType[k]=candyType[i];
                k++;
            }
        }
        int eat=k;
        return Math.min(eat,n);        
    }
}
