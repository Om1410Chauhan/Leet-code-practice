class Solution {
    /*
     HashMap<String,List<Integer>>map=new HashMap<>();
    
    public List<Integer> diffWaysToCompute(String expression) {
        /*
        List<Integer> current=new ArrayList();
        // to check operators at every character of string
        for(int i=0;i<expression.length();i++){
            char c=expression.charAt(i);
            // to check if c==+,*,-;
              if(c=='+' || c=='-'|| c=='*'){
                  // if it is than we divide our string into two parts
               String a1=expression.substring(0,i);
               String b1=expression.substring(i+1);
                  // we get two list having numbers now we perform the operation on them
               List<Integer> l1=diffWaysToCompute(a1);
               List<Integer> l2=diffWaysToCompute(b1);
                  // take every element of list1 and list2;
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
    
        // using memoiazation
        List<Integer> current=new ArrayList();
       
     
         if(map.get(expression)!=null){
             return map.get(expression);
         }
         
        // to check operators at every character of string
        for(int i=0;i<expression.length();i++){
            char c=expression.charAt(i);
            // to check if c==+,*,-;
              if(c=='+' || c=='-'|| c=='*'){
                  // if it is than we divide our string into two parts
               String a1=expression.substring(0,i);
               String b1=expression.substring(i+1);
                  // we get two list having numbers now we perform the operation on them
               List<Integer> l1=diffWaysToCompute(a1);
               List<Integer> l2=diffWaysToCompute(b1);
                  // take every element of list1 and list2;
               for(int x:l1){
                   for(int y:l2){
                        if(c=='+'){
                           current.add(x+y);
                           break;
                       }
                       else if(c=='-'){
                           current.add(x-y);
                           break;
                       }
                       else if(c=='*'){
                           current.add(x*y);
                           break;
                       }
                   }
               }
                  
            }
            
        }
        
        // to add value like single integer 2,3 in list
        if(current.size()==0){
            current.add(Integer.valueOf(expression));
        }
        map.put(expression,current);
        return current;
    }
    */
    HashMap<String, List<Integer>> memo = new HashMap<>();
    
    public List<Integer> diffWaysToCompute(String expression) {
        if(memo.containsKey(expression)){
            return memo.get(expression);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < expression.length(); i++){
            char c = expression.charAt(i);
            if(c == '*' || c == '+' || c == '-'){
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
                for(int l : left){
                    for(int r : right){
                        if(c == '*'){
                            list.add(l * r);
                        }else if(c == '+'){
                            list.add(l + r);
                        }else if(c == '-'){
                            list.add(l - r);
                        }
                    }
                }
            }
        }
        
        if(list.size() == 0){
            list.add(Integer.valueOf(expression));
        }
        
        memo.put(expression, list);
        return list;
    }
    
}
