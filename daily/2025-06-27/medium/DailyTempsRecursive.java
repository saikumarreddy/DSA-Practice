/**
 * Problem: Daily Temperatures [Recursive]
 * Link:    https://leetcode.com/problems/daily-temperatures/
 * Level:   Medium
 * Topic:   Stack, Monotonic Stack
 *
 * Approach: Recursive decomposition — divide into subproblems and combine results.
 * Time:  O(n)
 * Space: O(n)
 */
import java.util.Arrays;
import java.util.Stack;

public class DailyTempsRecursive {

    public int[] dailyTemperatures(int[] temps) {
        int[] res = new int[temps.length];
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<temps.length;i++) {
            while(!stack.isEmpty() && temps[i]>temps[stack.peek()])
                res[stack.peek()] = i - stack.pop();
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        DailyTempsRecursive sol = new DailyTempsRecursive();
        System.out.println(Arrays.toString(sol.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73}))); // [1,1,4,2,1,1,0,0]
    }
}
