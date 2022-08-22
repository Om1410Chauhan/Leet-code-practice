class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0){
            return new ArrayList();
        }
        List<List<Integer>> li=new ArrayList();
        for(int i=1;i<=numRows;i++){
            List<Integer>current=new ArrayList();
            // j varies according to number of rows
            for(int j=0;j<i;j++){
                if(j==0 || j==i-1){
                    current.add(1);
                }else{
                    // we get previous row from li and get j th and j-1 element beacuse we need j and j-1 elemenet
                    // to build our new element 
                    current.add(li.get(i-2).get(j)+li.get(i-2).get(j-1));
                }
             
            } 
               li.add(current);
        }
             return li;
    }
}