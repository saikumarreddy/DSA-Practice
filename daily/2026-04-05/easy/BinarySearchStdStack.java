/**
 * Problem: Binary Search [Stack]
 * Link:    https://leetcode.com/problems/binary-search/
 * Level:   Easy
 * Topic:   Binary Search
 *
 * Approach: Stack-based simulation — replaces call stack with explicit stack structure.
 * Time:  O(log n)
 * Space: O(1)
 */

public class BinarySearchStdStack {

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
        BinarySearchStdStack sol = new BinarySearchStdStack();
        System.out.println(sol.search(new int[]{-1,0,3,5,9,12},9)); // 4
        System.out.println(sol.search(new int[]{-1,0,3,5,9,12},2)); // -1
    }
}
