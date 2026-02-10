/**
 * Problem: Move Zeroes [Stack]
 * Link:    https://leetcode.com/problems/move-zeroes/
 * Level:   Easy
 * Topic:   Arrays, Two Pointers
 *
 * Approach: Stack-based simulation — replaces call stack with explicit stack structure.
 * Time:  O(n)
 * Space: O(1)
 */
import java.util.Arrays;

public class MoveZeroesStack {

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
        MoveZeroesStack sol = new MoveZeroesStack();
        int[] a = {0,1,0,3,12};
        sol.moveZeroes(a);
        System.out.println(Arrays.toString(a)); // [1, 3, 12, 0, 0]
    }
}
