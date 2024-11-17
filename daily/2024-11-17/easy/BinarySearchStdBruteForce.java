/**
 * Problem: Binary Search [BruteForce]
 * Link:    https://leetcode.com/problems/binary-search/
 * Level:   Easy
 * Topic:   Binary Search
 *
 * Approach: Brute force — nested iteration for clarity; useful as a baseline comparison.
 * Time:  O(log n)
 * Space: O(1)
 */

public class BinarySearchStdBruteForce {

    public int search(int[] nums, int target) {
        int lo=0, hi=nums.length-1;
        while(lo<=hi) {
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) lo=mid+1;
            else hi=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearchStdBruteForce sol = new BinarySearchStdBruteForce();
        System.out.println(sol.search(new int[]{-1,0,3,5,9,12},9)); // 4
        System.out.println(sol.search(new int[]{-1,0,3,5,9,12},2)); // -1
    }
}
