class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s){
        int left = 0;
        int maxLen = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i+1);
            }else{
                left = Math.max(map.get(s.charAt(i)),left);
                map.remove(s.charAt(i));
                map.put(s.charAt(i),i+1);
            }
            maxLen = Math.max(i-left+1,maxLen);
        }
        return maxLen;
        
    }
    /**
    public int lengthOfLongestSubstring(String s) {
        
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            Set<Character> set = new HashSet<>();
            int j = i;
            int len = 0;
            for(j = i; j < s.length(); j++){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    len++;
                }else{
                    break;
                } 
            }
            if(len > max){
                max = len;
            }
        }
        return max;
    }
     */
}
