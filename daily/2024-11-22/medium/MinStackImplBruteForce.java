/**
 * Problem: Min Stack [BruteForce]
 * Link:    https://leetcode.com/problems/min-stack/
 * Level:   Medium
 * Topic:   Stack
 *
 * Approach: Brute force — nested iteration for clarity; useful as a baseline comparison.
 * Time:  O(1)
 * Space: O(n)
 */
import java.util.Stack;

public class MinStackImplBruteForce {

    Stack<Integer> stack = new Stack<>(), minStack = new Stack<>();
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) minStack.push(val);
    }
    public void pop() {
        if (stack.pop().equals(minStack.peek())) minStack.pop();
    }
    public int top() { return stack.peek(); }
    public int getMin() { return minStack.peek(); }

    public static void main(String[] args) {
        MinStackImplBruteForce ms = new MinStackImplBruteForce();
        ms.push(-2); ms.push(0); ms.push(-3);
        System.out.println(ms.getMin()); // -3
        ms.pop();
        System.out.println(ms.top());    // 0
        System.out.println(ms.getMin()); // -2
    }
}
