class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> sc=new Stack();
        for(char ch:s.toCharArray()){
             if(ch=='('|| ch=='['|| ch=='{'){
                 sc.add(ch);
             }else{
                 if(sc.isEmpty())return false;
                 if(ch=='}' && sc.peek()!='{' )return false;
                 if(ch==']'&& sc.peek()!='[' )return false;
                 if(ch==')'&& sc.peek()!='(' )return false;
                 
                 sc.pop();
             }
        }
        return sc.isEmpty();
    }
}
