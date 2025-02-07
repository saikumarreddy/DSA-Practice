/**
 * Problem: Top K Frequent Elements [TwoPtr]
 * Link:    https://leetcode.com/problems/top-k-frequent-elements/
 * Level:   Medium
 * Topic:   Heap, Hashing
 *
 * Approach: Two-pointer variant — reduces auxiliary space by leveraging sorted order.
 * Time:  O(n log k)
 * Space: O(n)
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentWordsTwoPtr {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int n:nums) freq.merge(n,1,Integer::sum);
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->freq.get(a)-freq.get(b));
        for(int n:freq.keySet()) { pq.offer(n); if(pq.size()>k) pq.poll(); }
        int[] res=new int[k];
        for(int i=k-1;i>=0;i--) res[i]=pq.poll();
        return res;
    }

    public static void main(String[] args) {
        TopKFrequentWordsTwoPtr sol = new TopKFrequentWordsTwoPtr();
        System.out.println(Arrays.toString(sol.topKFrequent(new int[]{1,1,1,2,2,3},2))); // [1,2]
    }
}
