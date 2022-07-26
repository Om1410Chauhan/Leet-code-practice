class Solution {
    String[] keyPad=new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    public List<String> letterCombinations(String digits) {
        List<String> li=new ArrayList();
        StringBuilder s=new StringBuilder();
        if(digits.length()==0){
            return li;
        }
        combination(li,s,0,digits,keyPad);
        return li;
    }
    void combination(List<String>li,StringBuilder s,int index,String digits,String[] keyPad){
        
        if(digits.length()==index){
            li.add(s.toString());
            return;
        }
        String  data=keyPad[digits.charAt(index)-'0'];
        for(char ch:data.toCharArray()){
            s.append(ch);
            combination(li,s,index+1,digits,keyPad);
            s.deleteCharAt(s.length()-1); 
        }
        
    }
}





































