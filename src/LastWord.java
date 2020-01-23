public class LastWord {
    /**
     * 最后一个单词的长度
     * @param s
     * @return
     */
    public static int lengthOfLastWord (String s) {
        int count = 0;
        for (int i = s.length()-1; i >= 0 ; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            }else {
                if (count != 0){
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "a ";
        System.out.println(lengthOfLastWord(str));
    }
}
