/**
 * Problem: Search Insert Position [TwoPtr]
 * Link:    https://leetcode.com/problems/search-insert-position/
 * Level:   Easy
 * Topic:   Binary Search
 *
 * Approach: Two-pointer variant — reduces auxiliary space by leveraging sorted order.
 * Time:  O(log n)
 * Space: O(1)
 */

public class SearchInsertPosTwoPtr {

    public int searchInsert(int[] nums, int target) {
        int lo=0, hi=nums.length;
        while(lo<hi) { int mid=lo+(hi-lo)/2; if(nums[mid]<target) lo=mid+1; else hi=mid; }
        return lo;
    }

    public static void main(String[] args) {
        SearchInsertPosTwoPtr sol = new SearchInsertPosTwoPtr();
        System.out.println(sol.searchInsert(new int[]{1,3,5,6},5)); // 2
        System.out.println(sol.searchInsert(new int[]{1,3,5,6},2)); // 1
        System.out.println(sol.searchInsert(new int[]{1,3,5,6},7)); // 4
    }
}
