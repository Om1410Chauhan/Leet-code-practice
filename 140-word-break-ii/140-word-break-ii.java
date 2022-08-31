class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
       HashSet<String> set=new HashSet<>(wordDict);
        HashMap<Integer,List<String>> map=new HashMap<>();
        return helper(s,0,set,map);
    }
    private List<String> helper(String s,int start,HashSet<String> dict,HashMap<Integer,List<String>> map){
        List<String> current=new ArrayList<>();
        if(map.containsKey(start)){
            return map.get(start);
        }
        if(start==s.length()){
            current.add("");
        }
        for(int i=start+1;i<=s.length();i++){
            String prefix=s.substring(start,i);
            if(dict.contains(prefix)){
                List<String> suffix=helper(s,i,dict,map);
               for(String str: suffix){
                  current.add(prefix+ (str.equals("")?"":" ") +str);
               }
            }
        }
        map.put(start,current);
        return current;
    }
}