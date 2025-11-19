/**
 * Problem: Evaluate Reverse Polish Notation [BFS]
 * Link:    https://leetcode.com/problems/evaluate-reverse-polish-notation/
 * Level:   Medium
 * Topic:   Stack
 *
 * Approach: BFS traversal — level-by-level exploration guarantees shortest path.
 * Time:  O(n)
 * Space: O(n)
 */
import java.util.Stack;

public class EvalRPNBFS {

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
        EvalRPNBFS sol = new EvalRPNBFS();
        System.out.println(sol.evalRPN(new String[]{"2","1","+","3","*"})); // 9
        System.out.println(sol.evalRPN(new String[]{"4","13","5","/","+"})); // 6
    }
}
