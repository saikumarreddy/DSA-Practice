/**
 * Problem: Evaluate Reverse Polish Notation [Recursive]
 * Link:    https://leetcode.com/problems/evaluate-reverse-polish-notation/
 * Level:   Medium
 * Topic:   Stack
 *
 * Approach: Recursive decomposition — divide into subproblems and combine results.
 * Time:  O(n)
 * Space: O(n)
 */
import java.util.Stack;

public class EvalRPNRecursive {

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
        EvalRPNRecursive sol = new EvalRPNRecursive();
        System.out.println(sol.evalRPN(new String[]{"2","1","+","3","*"})); // 9
        System.out.println(sol.evalRPN(new String[]{"4","13","5","/","+"})); // 6
    }
}
