/**
 * Problem: Valid Parentheses
 * Link:    https://leetcode.com/problems/valid-parentheses/
 * Level:   Easy
 * Topic:   Stack
 *
 * Approach: Push open brackets onto a stack. For every closing bracket,
 *           check the top of the stack for the matching open bracket.
 * Time:  O(n)
 * Space: O(n)
 */
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses sol = new ValidParentheses();
        System.out.println(sol.isValid("()"));       // true
        System.out.println(sol.isValid("()[]{}"));   // true
        System.out.println(sol.isValid("(]"));       // false
        System.out.println(sol.isValid("([)]"));     // false
        System.out.println(sol.isValid("{[]}"));     // true
    }
}
