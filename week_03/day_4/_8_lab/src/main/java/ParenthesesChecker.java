import java.util.Stack;

public class ParenthesesChecker {

    public boolean checkParentheses(String testString) {

        Stack<Character> stack = new Stack<Character>();

        char tester;

        for (int i = 0; i < testString.length(); i++) {

            tester = testString.charAt(i);

            if (tester == '(' || tester == '{' || tester == '<' || tester == '[') {
                stack.push(tester);
            } else if (tester == ')') {
                if (stack.empty()) {
                    return false;
                } else if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (tester == '}') {
                if (stack.empty()) {
                    return false;
                } else if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }else if (tester == '>') {
                if (stack.empty()) {
                    return false;
                } else if (stack.peek() == '<') {
                    stack.pop();
                } else {
                    return false;
                }
            }else if (tester == ']') {
                if (stack.empty()) {
                    return false;
                } else if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}