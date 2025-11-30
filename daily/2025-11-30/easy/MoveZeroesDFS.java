/**
 * Problem: Move Zeroes [DFS]
 * Link:    https://leetcode.com/problems/move-zeroes/
 * Level:   Easy
 * Topic:   Arrays, Two Pointers
 *
 * Approach: DFS traversal — depth-first exploration with backtracking on dead ends.
 * Time:  O(n)
 * Space: O(1)
 */
import java.util.Arrays;

public class MoveZeroesDFS {

    public void moveZeroes(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int tmp = nums[left]; nums[left] = nums[right]; nums[right] = tmp;
                left++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeroesDFS sol = new MoveZeroesDFS();
        int[] a = {0,1,0,3,12};
        sol.moveZeroes(a);
        System.out.println(Arrays.toString(a)); // [1, 3, 12, 0, 0]
    }
}
