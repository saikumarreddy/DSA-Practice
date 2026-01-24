/**
 * Problem: Search Insert Position [DFS]
 * Link:    https://leetcode.com/problems/search-insert-position/
 * Level:   Easy
 * Topic:   Binary Search
 *
 * Approach: DFS traversal — depth-first exploration with backtracking on dead ends.
 * Time:  O(log n)
 * Space: O(1)
 */

public class SearchInsertPosDFS {

    public int searchInsert(int[] nums, int target) {
        int lo=0, hi=nums.length;
        while(lo<hi) { int mid=lo+(hi-lo)/2; if(nums[mid]<target) lo=mid+1; else hi=mid; }
        return lo;
    }

    public static void main(String[] args) {
        SearchInsertPosDFS sol = new SearchInsertPosDFS();
        System.out.println(sol.searchInsert(new int[]{1,3,5,6},5)); // 2
        System.out.println(sol.searchInsert(new int[]{1,3,5,6},2)); // 1
        System.out.println(sol.searchInsert(new int[]{1,3,5,6},7)); // 4
    }
}
