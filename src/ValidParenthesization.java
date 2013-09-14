import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: abhinav
 * Date: 15/8/13
 * Time: 4:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class ValidParenthesization {
    public boolean isValidParenthesization(String pattern) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == '(') {
                stack.push('(');
            }
            else if (pattern.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
            else {
                System.out.println("Invalid Pattern");
                return false;
            }
        }
        return stack.isEmpty();
    }
}
