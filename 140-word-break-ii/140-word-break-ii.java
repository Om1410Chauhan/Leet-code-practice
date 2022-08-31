class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
       HashSet<String> set=new HashSet<>(wordDict);
        return helper(s,0,set);
    }
    private List<String> helper(String s,int start,HashSet<String> dict){
        List<String> current=new ArrayList<>();
        if(start==s.length()){
            current.add("");
        }
        for(int i=start+1;i<=s.length();i++){
            String prefix=s.substring(start,i);
            if(dict.contains(prefix)){
                List<String> suffix=helper(s,i,dict);
               for(String str: suffix){
                  current.add(prefix+ (str.equals("")?"":" ") +str);
               }
            }
        }
        return current;
    }
}