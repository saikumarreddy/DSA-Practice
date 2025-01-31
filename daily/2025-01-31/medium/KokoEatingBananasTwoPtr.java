/**
 * Problem: Koko Eating Bananas [TwoPtr]
 * Link:    https://leetcode.com/problems/koko-eating-bananas/
 * Level:   Medium
 * Topic:   Binary Search
 *
 * Approach: Two-pointer variant — reduces auxiliary space by leveraging sorted order.
 * Time:  O(n log m)
 * Space: O(1)
 */

public class KokoEatingBananasTwoPtr {

    public int minEatingSpeed(int[] piles, int h) {
        int lo=1, hi=0;
        for(int p:piles) hi=Math.max(hi,p);
        while(lo<hi) {
            int mid=lo+(hi-lo)/2;
            long hours=0;
            for(int p:piles) hours+=(p+mid-1)/mid;
            if(hours<=h) hi=mid; else lo=mid+1;
        }
        return lo;
    }

    public static void main(String[] args) {
        KokoEatingBananasTwoPtr sol = new KokoEatingBananasTwoPtr();
        System.out.println(sol.minEatingSpeed(new int[]{3,6,7,11},8)); // 4
        System.out.println(sol.minEatingSpeed(new int[]{30,11,23,4,20},5)); // 30
    }
}
