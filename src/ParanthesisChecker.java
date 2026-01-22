import java.util.*;
public class ParanthesisChecker {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            if(ch == ')' || ch == '}' || ch == ']') {
                if(stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')){
                    return false;
                }
            }
            }
        return stack.isEmpty();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        boolean result = isBalanced(expression);
        System.out.println(result);
    }
}
