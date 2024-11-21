/**
 * Problem: Capacity to Ship Packages Within D Days [BruteForce]
 * Link:    https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
 * Level:   Medium
 * Topic:   Binary Search
 *
 * Approach: Brute force — nested iteration for clarity; useful as a baseline comparison.
 * Time:  O(n log n)
 * Space: O(1)
 */

public class CapacityShipPackagesBruteForce {

    public int shipWithinDays(int[] weights, int days) {
        int lo=0, hi=0;
        for(int w:weights) { lo=Math.max(lo,w); hi+=w; }
        while(lo<hi) {
            int mid=lo+(hi-lo)/2;
            int d=1, curr=0;
            for(int w:weights) { if(curr+w>mid){d++;curr=0;} curr+=w; }
            if(d<=days) hi=mid; else lo=mid+1;
        }
        return lo;
    }

    public static void main(String[] args) {
        CapacityShipPackagesBruteForce sol = new CapacityShipPackagesBruteForce();
        System.out.println(sol.shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10},5)); // 15
        System.out.println(sol.shipWithinDays(new int[]{3,2,2,4,1,4},3));           // 6
    }
}
