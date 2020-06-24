import java.nio.charset.CharacterCodingException;
import java.util.ArrayDeque;
import java.util.Deque;

public class TestCode20 {
    public static void main(String[] args) {
        String str = "{[(])}";
        System.out.println(isValid(str));
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String str){
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0;i<str.length();i++){
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                stack.push(str.charAt(i));
            }
            else{
                if (stack.isEmpty()){
                    return false;
                }
                else{
                    if(stack.peek() == '(' && str.charAt(i) != ')'){
                        return false;
                    }
                    else if(stack.peek() == '{' && str.charAt(i) != '}'){
                        return false;
                    }
                    else if(stack.peek() == '[' && str.charAt(i) != ']'){
                        return false;
                    }
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
