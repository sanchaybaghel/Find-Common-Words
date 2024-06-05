import java.util.Stack;

public class checkvalidString {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("{");
        stack.push(")");
        System.out.println(stack.pop());
       
    }
}
