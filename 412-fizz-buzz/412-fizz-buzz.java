class Solution {
    public List<String> fizzBuzz(int n) {
       List<String>li=new ArrayList();
        for(int i=0;i<n;i++){
            if((i+1)%3==0 && (i+1)%5==0){
                li.add("FizzBuzz");
            }else if((i+1)%3==0){
                li.add("Fizz");
            }else if((i+1)%5==0){
                li.add("Buzz");
            }else{
                int a=i+1;
                String s=Integer.toString(a);
                li.add(s);
            }
        }
        return li;
    }
}