/**
 * Problem: Find the Duplicate Number [TwoPtr]
 * Link:    https://leetcode.com/problems/find-the-duplicate-number/
 * Level:   Medium
 * Topic:   Arrays, Two Pointers
 *
 * Approach: Two-pointer variant — reduces auxiliary space by leveraging sorted order.
 * Time:  O(n)
 * Space: O(1)
 */

public class FindDuplicateTwoPtr {

    public int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0];
        do { slow = nums[slow]; fast = nums[nums[fast]]; } while (slow != fast);
        slow = nums[0];
        while (slow != fast) { slow = nums[slow]; fast = nums[fast]; }
        return slow;
    }

    public static void main(String[] args) {
        FindDuplicateTwoPtr sol = new FindDuplicateTwoPtr();
        System.out.println(sol.findDuplicate(new int[]{1,3,4,2,2})); // 2
        System.out.println(sol.findDuplicate(new int[]{3,1,3,4,2})); // 3
    }
}
