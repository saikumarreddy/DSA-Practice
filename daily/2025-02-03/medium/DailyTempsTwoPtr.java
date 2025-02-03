/**
 * Problem: Daily Temperatures [TwoPtr]
 * Link:    https://leetcode.com/problems/daily-temperatures/
 * Level:   Medium
 * Topic:   Stack, Monotonic Stack
 *
 * Approach: Two-pointer variant — reduces auxiliary space by leveraging sorted order.
 * Time:  O(n)
 * Space: O(n)
 */
import java.util.Arrays;
import java.util.Stack;

public class DailyTempsTwoPtr {

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
        DailyTempsTwoPtr sol = new DailyTempsTwoPtr();
        System.out.println(Arrays.toString(sol.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73}))); // [1,1,4,2,1,1,0,0]
    }
}
