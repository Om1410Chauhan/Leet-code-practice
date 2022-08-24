class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> li=new ArrayList();
        String s="(";
        findAll(li,s,1,0,n);
        return li;
        
    }
    void findAll(List<String>li,String current,int o,int c,int n){
        if(current.length()==2*n){
            li.add(current);
            return;
        }
        // o is number of open bracket and c number of close bracket
        if(o<n)findAll(li,current+"(",o+1,c,n);
        if(c<o)findAll(li,current+")",o,c+1,n);
    }
}
