/**
 * Problem: Evaluate Reverse Polish Notation [TwoPtr]
 * Link:    https://leetcode.com/problems/evaluate-reverse-polish-notation/
 * Level:   Medium
 * Topic:   Stack
 *
 * Approach: Two-pointer variant — reduces auxiliary space by leveraging sorted order.
 * Time:  O(n)
 * Space: O(n)
 */
import java.util.Stack;

public class EvalRPNTwoPtr {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String t : tokens) {
            if("+-*/".contains(t)) {
                int b=stack.pop(), a=stack.pop();
                switch(t) {
                    case "+": stack.push(a+b); break;
                    case "-": stack.push(a-b); break;
                    case "*": stack.push(a*b); break;
                    case "/": stack.push(a/b); break;
                }
            } else stack.push(Integer.parseInt(t));
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        EvalRPNTwoPtr sol = new EvalRPNTwoPtr();
        System.out.println(sol.evalRPN(new String[]{"2","1","+","3","*"})); // 9
        System.out.println(sol.evalRPN(new String[]{"4","13","5","/","+"})); // 6
    }
}
