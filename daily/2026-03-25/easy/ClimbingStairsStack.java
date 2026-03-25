/**
 * Problem: Climbing Stairs [Stack]
 * Link:    https://leetcode.com/problems/climbing-stairs/
 * Level:   Easy
 * Topic:   DP
 *
 * Approach: Stack-based simulation — replaces call stack with explicit stack structure.
 * Time:  O(n)
 * Space: O(1)
 */

public class ClimbingStairsStack {

    public int climbStairs(int n) {
        if (n <= 2) return n;
        int a=1, b=2;
        for (int i=3;i<=n;i++) { int c=a+b; a=b; b=c; }
        return b;
    }

    public static void main(String[] args) {
        ClimbingStairsStack sol = new ClimbingStairsStack();
        System.out.println(sol.climbStairs(2)); // 2
        System.out.println(sol.climbStairs(3)); // 3
        System.out.println(sol.climbStairs(5)); // 8
    }
}
