package string;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        int start = 0;
        int len = 1;
        for(int i = 0; i < s.length(); i++){
            int left = i;
            int right = i;
            while(left-1 >= 0 && s.charAt(left-1) == s.charAt(i)){
                left--;
            }
            while(right+1 <= s.length()-1 && s.charAt(right+1) == s.charAt(i)){
                right++;
            }

            while(left > 0 && right < s.length()-1
                    && s.charAt(left-1) == s.charAt(right+1)){
                right++;
                left--;
            }
            if(right-left+1>len){
                len = right-left+1;
                start = left;
            }
        }
        return s.substring(start,start+len);
    }
}
