/**
 * Problem: Trapping Rain Water [BruteForce]
 * Link:    https://leetcode.com/problems/trapping-rain-water/
 * Level:   Hard
 * Topic:   Arrays, Two Pointers
 *
 * Approach: Brute force — nested iteration for clarity; useful as a baseline comparison.
 * Time:  O(n)
 * Space: O(1)
 */

public class TrappingRainWaterBruteForce {

    public int trap(int[] height) {
        int left = 0, right = height.length - 1, maxL = 0, maxR = 0, water = 0;
        while (left < right) {
            if (height[left] <= height[right]) {
                maxL = Math.max(maxL, height[left]);
                water += maxL - height[left++];
            } else {
                maxR = Math.max(maxR, height[right]);
                water += maxR - height[right--];
            }
        }
        return water;
    }

    public static void main(String[] args) {
        TrappingRainWaterBruteForce sol = new TrappingRainWaterBruteForce();
        System.out.println(sol.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1})); // 6
        System.out.println(sol.trap(new int[]{4,2,0,3,2,5}));              // 9
    }
}
