/**
 * Problem: Rotate Array [DFS]
 * Link:    https://leetcode.com/problems/rotate-array/
 * Level:   Medium
 * Topic:   Arrays
 *
 * Approach: DFS traversal — depth-first exploration with backtracking on dead ends.
 * Time:  O(n)
 * Space: O(1)
 */
import java.util.Arrays;

public class RotateArrayDFS {

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    private void reverse(int[] a, int l, int r) {
        while (l < r) { int t = a[l]; a[l++] = a[r]; a[r--] = t; }
    }

    public static void main(String[] args) {
        RotateArrayDFS sol = new RotateArrayDFS();
        int[] a = {1,2,3,4,5,6,7};
        sol.rotate(a, 3);
        System.out.println(Arrays.toString(a)); // [5, 6, 7, 1, 2, 3, 4]
    }
}
