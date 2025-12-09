/**
 * Problem: Jump Game [DFS]
 * Link:    https://leetcode.com/problems/jump-game/
 * Level:   Medium
 * Topic:   Arrays, Greedy
 *
 * Approach: DFS traversal — depth-first exploration with backtracking on dead ends.
 * Time:  O(n)
 * Space: O(1)
 */

public class JumpGameDFS {

    public boolean canJump(int[] nums) {
        int reach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reach) return false;
            reach = Math.max(reach, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        JumpGameDFS sol = new JumpGameDFS();
        System.out.println(sol.canJump(new int[]{2,3,1,1,4})); // true
        System.out.println(sol.canJump(new int[]{3,2,1,0,4})); // false
    }
}
