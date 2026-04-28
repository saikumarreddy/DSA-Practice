/**
 * Problem: Container With Most Water
 * Link:    https://leetcode.com/problems/container-with-most-water/
 * Level:   Medium
 * Topic:   Arrays, Two Pointers
 *
 * Approach: Two pointers at both ends. Area = min(height[l], height[r]) * (r - l).
 *           Move the pointer with the smaller height inward — it's the only side
 *           that could possibly yield a larger area.
 * Time:  O(n)
 * Space: O(1)
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ContainerWithMostWater sol = new ContainerWithMostWater();
        System.out.println(sol.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})); // 49
        System.out.println(sol.maxArea(new int[]{1, 1}));                        // 1
        System.out.println(sol.maxArea(new int[]{4, 3, 2, 1, 4}));              // 16
    }
}
