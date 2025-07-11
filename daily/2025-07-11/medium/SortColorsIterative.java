/**
 * Problem: Sort Colors [Iterative]
 * Link:    https://leetcode.com/problems/sort-colors/
 * Level:   Medium
 * Topic:   Arrays, Two Pointers
 *
 * Approach: Iterative implementation — equivalent logic using explicit stack/loop.
 * Time:  O(n)
 * Space: O(1)
 */
import java.util.Arrays;

public class SortColorsIterative {

    public void sortColors(int[] nums) {
        int lo = 0, mid = 0, hi = nums.length - 1;
        while (mid <= hi) {
            if (nums[mid] == 0) { swap(nums, lo++, mid++); }
            else if (nums[mid] == 1) { mid++; }
            else { swap(nums, mid, hi--); }
        }
    }
    private void swap(int[] a, int i, int j) { int t=a[i]; a[i]=a[j]; a[j]=t; }

    public static void main(String[] args) {
        SortColorsIterative sol = new SortColorsIterative();
        int[] a = {2,0,2,1,1,0};
        sol.sortColors(a);
        System.out.println(Arrays.toString(a)); // [0, 0, 1, 1, 2, 2]
    }
}
