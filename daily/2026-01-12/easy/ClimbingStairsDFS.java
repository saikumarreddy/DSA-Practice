/**
 * Problem: Climbing Stairs [DFS]
 * Link:    https://leetcode.com/problems/climbing-stairs/
 * Level:   Easy
 * Topic:   DP
 *
 * Approach: DFS traversal — depth-first exploration with backtracking on dead ends.
 * Time:  O(n)
 * Space: O(1)
 */

public class ClimbingStairsDFS {

    public int climbStairs(int n) {
        if (n <= 2) return n;
        int a=1, b=2;
        for (int i=3;i<=n;i++) { int c=a+b; a=b; b=c; }
        return b;
    }

    public static void main(String[] args) {
        ClimbingStairsDFS sol = new ClimbingStairsDFS();
        System.out.println(sol.climbStairs(2)); // 2
        System.out.println(sol.climbStairs(3)); // 3
        System.out.println(sol.climbStairs(5)); // 8
    }
}
