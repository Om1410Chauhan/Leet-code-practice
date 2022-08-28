class Solution {
    // we declared it outside function because if it is defined inside function whenever function is called new hahshmap is always defined
    private Map<String,Boolean> map=new HashMap();
    public boolean wordBreak(String s, List<String> wordDict) {
        
        if(wordDict.contains(s)){
            return true;
        }
        if(map.containsKey(s)){
            return map.get(s);
        }
        int n=s.length();
        for(int i=1;i<n;i++){
            String temp=s.substring(0,i);
            if(wordDict.contains(temp) && wordBreak(s.substring(i),wordDict)){
                map.put(s,true);
                return true;
            }
        }
        map.put(s,false);
        return false;
        
        
    }
}