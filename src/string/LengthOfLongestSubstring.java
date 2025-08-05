class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s){
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
}
