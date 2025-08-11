package string;

import java.util.*;

public class LetterCombinations {
    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        Map<Character,String[]> map = new HashMap() {{
            put('2', new String[]{"a", "b", "c"});
            put('3', new String[]{"d", "e", "f"});
            put('4', new String[]{"g", "h", "i"});
            put('5', new String[]{"j", "k", "l"});
            put('6', new String[]{"m", "n", "o"});
            put('7', new String[]{"p", "q", "r", "s"});
            put('8', new String[]{"t", "u", "v"});
            put('9', new String[]{"w", "x", "y", "z"});
        }};
        for(int i = 0; i < digits.length(); i++){
            char c = digits.charAt(i);
            String[] strings = map.get(c);
            if(queue.size() == 0){
                for(String letter : strings){
                    queue.add(letter);
                }
            }else{
                int count = queue.size();
                for(int j = 0; j < count; j++){
                    String s = queue.poll();
                    for(String letter : strings){
                        queue.add(s+letter);
                    }
                }
            }
        }
        for(String s : queue){
            list.add(s);
        }

        return list;
    }

    public static void main(String[] args) {
        letterCombinations("23");
    }
}
