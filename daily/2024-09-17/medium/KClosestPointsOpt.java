/**
 * Problem: K Closest Points to Origin [Opt]
 * Link:    https://leetcode.com/problems/k-closest-points-to-origin/
 * Level:   Medium
 * Topic:   Heap, Sorting
 *
 * Approach: Optimized approach — improved space/time complexity over the basic solution.
 * Time:  O(n log k)
 * Space: O(k)
 */
import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPointsOpt {

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]*b[0]+b[1]*b[1]-a[0]*a[0]-a[1]*a[1]);
        for(int[] p:points) { pq.offer(p); if(pq.size()>k) pq.poll(); }
        int[][] res=new int[k][];
        for(int i=0;i<k;i++) res[i]=pq.poll();
        return res;
    }

    public static void main(String[] args) {
        KClosestPointsOpt sol = new KClosestPointsOpt();
        System.out.println(Arrays.deepToString(sol.kClosest(new int[][]{{1,3},{-2,2}},1))); // [[-2,2]]
    }
}
