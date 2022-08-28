class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> li=new ArrayList();
        List<String> current=new ArrayList();
        helper(li,current,s,0);
        return li;
    }
    private void helper(List<List<String>> li,List<String> current,String s,int index){
        
        if(index==s.length()){
            li.add(new ArrayList(current));
            return ;
        }
        // here index is index+1(0 means 1 i.e 0+1) in how many parts we are breaking the string
        
        for(int i=index;i<s.length();i++){
            if(isPalindrome(index,i,s)){
                current.add(s.substring(index,i+1));
                helper(li,current,s,i+1);
                current.remove(current.size()-1);
            }
        }
    }
    
    private boolean isPalindrome(int i,int j,String s){
        while(i<=j){
            if(s.charAt(i++)!=s.charAt(j--)){
                return  false;
            }
        }
        return true;
    }
}