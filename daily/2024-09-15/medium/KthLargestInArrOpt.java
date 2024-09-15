/**
 * Problem: Kth Largest Element in an Array [Opt]
 * Link:    https://leetcode.com/problems/kth-largest-element-in-an-array/
 * Level:   Medium
 * Topic:   Heap, Sorting
 *
 * Approach: Optimized approach — improved space/time complexity over the basic solution.
 * Time:  O(n log k)
 * Space: O(k)
 */
import java.util.PriorityQueue;

public class KthLargestInArrOpt {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : nums) {
            pq.offer(n);
            if (pq.size() > k) pq.poll();
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        KthLargestInArrOpt sol = new KthLargestInArrOpt();
        System.out.println(sol.findKthLargest(new int[]{3,2,1,5,6,4},2)); // 5
        System.out.println(sol.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6},4)); // 4
    }
}
