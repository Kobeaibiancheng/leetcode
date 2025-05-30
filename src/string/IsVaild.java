package string;

import java.util.Stack;

public class IsVaild {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '(' || arr[i] == '[' || arr[i] == '{'){
                stack.push(arr[i]);
            }else{
                if(stack.empty()) return false;
                char top = stack.pop();
                if(top == '(' && arr[i] == ')'){
                    continue;
                }
                if(top == '[' && arr[i] == ']'){
                    continue;
                }
                if(top == '{' && arr[i] == '}'){
                    continue;
                }
                return false;
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('{');
        stack.pop();
    }
}
