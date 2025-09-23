/**
 * Problem: Find the Duplicate Number [BFS]
 * Link:    https://leetcode.com/problems/find-the-duplicate-number/
 * Level:   Medium
 * Topic:   Arrays, Two Pointers
 *
 * Approach: BFS traversal — level-by-level exploration guarantees shortest path.
 * Time:  O(n)
 * Space: O(1)
 */

public class FindDuplicateBFS {

    public int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0];
        do { slow = nums[slow]; fast = nums[nums[fast]]; } while (slow != fast);
        slow = nums[0];
        while (slow != fast) { slow = nums[slow]; fast = nums[fast]; }
        return slow;
    }

    public static void main(String[] args) {
        FindDuplicateBFS sol = new FindDuplicateBFS();
        System.out.println(sol.findDuplicate(new int[]{1,3,4,2,2})); // 2
        System.out.println(sol.findDuplicate(new int[]{3,1,3,4,2})); // 3
    }
}
