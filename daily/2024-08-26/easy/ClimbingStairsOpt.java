/**
 * Problem: Climbing Stairs [Opt]
 * Link:    https://leetcode.com/problems/climbing-stairs/
 * Level:   Easy
 * Topic:   DP
 *
 * Approach: Optimized approach — improved space/time complexity over the basic solution.
 * Time:  O(n)
 * Space: O(1)
 */

public class ClimbingStairsOpt {

    public int climbStairs(int n) {
        if (n <= 2) return n;
        int a=1, b=2;
        for (int i=3;i<=n;i++) { int c=a+b; a=b; b=c; }
        return b;
    }

    public static void main(String[] args) {
        ClimbingStairsOpt sol = new ClimbingStairsOpt();
        System.out.println(sol.climbStairs(2)); // 2
        System.out.println(sol.climbStairs(3)); // 3
        System.out.println(sol.climbStairs(5)); // 8
    }
}
