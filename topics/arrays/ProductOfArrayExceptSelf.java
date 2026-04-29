/**
 * Problem: Product of Array Except Self
 * Link:    https://leetcode.com/problems/product-of-array-except-self/
 * Level:   Medium
 * Topic:   Arrays, Prefix Products
 *
 * Approach: Two passes — forward pass fills result[i] with the product of all
 *           elements to the left of i. Backward pass multiplies in the product
 *           of all elements to the right using a running suffix variable.
 * Time:  O(n)
 * Space: O(1) excluding output array
 */
import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf sol = new ProductOfArrayExceptSelf();
        System.out.println(Arrays.toString(sol.productExceptSelf(new int[]{1, 2, 3, 4})));       // [24, 12, 8, 6]
        System.out.println(Arrays.toString(sol.productExceptSelf(new int[]{-1, 1, 0, -3, 3}))); // [0, 0, 9, 0, 0]
    }
}
