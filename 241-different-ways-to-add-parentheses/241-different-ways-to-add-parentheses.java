class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> current=new ArrayList();
    
        for(int i=0;i<expression.length();i++){
            char c=expression.charAt(i);
            
              if(c=='+' || c=='-'|| c=='*'){
               String a1=expression.substring(0,i);
               String b1=expression.substring(i+1);
               List<Integer> l1=diffWaysToCompute(a1);
               List<Integer> l2=diffWaysToCompute(b1);
               for(int x:l1){
                   for(int y:l2){
                       if(c=='+'){
                           current.add(x+y);
                       }
                       else if(c=='-'){
                           current.add(x-y);
                       }
                       else if(c=='*'){
                           current.add(x*y);
                       }
                   }
               }
                  
            }
            
        }
        // to add value like single integer 2,3 in list
        if(current.size()==0){
            current.add(Integer.valueOf(expression));
        }
        return current;
    }
}