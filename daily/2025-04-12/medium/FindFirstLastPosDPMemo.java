/**
 * Problem: Find First and Last Position of Element in Sorted Array [DPMemo]
 * Link:    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * Level:   Medium
 * Topic:   Binary Search
 *
 * Approach: DP memoization — top-down recursion with HashMap cache avoids recomputation.
 * Time:  O(log n)
 * Space: O(1)
 */
import java.util.Arrays;

public class FindFirstLastPosDPMemo {

    public int[] searchRange(int[] nums, int target) {
        return new int[]{findBound(nums,target,true), findBound(nums,target,false)};
    }
    private int findBound(int[] nums, int target, boolean first) {
        int lo=0, hi=nums.length-1, bound=-1;
        while(lo<=hi) {
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target) { bound=mid; if(first) hi=mid-1; else lo=mid+1; }
            else if(nums[mid]<target) lo=mid+1;
            else hi=mid-1;
        }
        return bound;
    }

    public static void main(String[] args) {
        FindFirstLastPosDPMemo sol = new FindFirstLastPosDPMemo();
        System.out.println(Arrays.toString(sol.searchRange(new int[]{5,7,7,8,8,10},8))); // [3,4]
        System.out.println(Arrays.toString(sol.searchRange(new int[]{5,7,7,8,8,10},6))); // [-1,-1]
    }
}
