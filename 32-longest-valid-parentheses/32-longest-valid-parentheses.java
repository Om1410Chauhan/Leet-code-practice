class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character> s1=new Stack();
        Stack<Integer> index=new Stack();
        index.push(-1);
        int max=0;
        for(int i=0;i<s.length();i++){
            // for opening bracket
           if(s.charAt(i)=='('){
               s1.add(s.charAt(i));
               index.push(i);
           }else{
               // for closing bracket
               if(!s1.isEmpty() && s.charAt(i)==')'){
                   s1.pop();
                   index.pop();
                   // here we calculated length of paireed parenthisis pairs and choose the max
                   max=Math.max(max,i-index.peek());
               }else{
                 index.push(i);
               }
            }
        }
        return max;
    }
}