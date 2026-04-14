/**
 * Problem: Kth Largest Element in an Array [Stack]
 * Link:    https://leetcode.com/problems/kth-largest-element-in-an-array/
 * Level:   Medium
 * Topic:   Heap, Sorting
 *
 * Approach: Stack-based simulation — replaces call stack with explicit stack structure.
 * Time:  O(n log k)
 * Space: O(k)
 */
import java.util.PriorityQueue;

public class KthLargestInArrStack {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : nums) {
            pq.offer(n);
            if (pq.size() > k) pq.poll();
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        KthLargestInArrStack sol = new KthLargestInArrStack();
        System.out.println(sol.findKthLargest(new int[]{3,2,1,5,6,4},2)); // 5
        System.out.println(sol.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6},4)); // 4
    }
}
