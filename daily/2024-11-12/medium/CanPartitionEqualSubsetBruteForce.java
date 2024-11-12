/**
 * Problem: Partition Equal Subset Sum [BruteForce]
 * Link:    https://leetcode.com/problems/partition-equal-subset-sum/
 * Level:   Medium
 * Topic:   DP, 0/1 Knapsack
 *
 * Approach: Brute force — nested iteration for clarity; useful as a baseline comparison.
 * Time:  O(n*sum)
 * Space: O(sum)
 */

public class CanPartitionEqualSubsetBruteForce {

    public boolean canPartition(int[] nums) {
        int sum=0; for(int n:nums) sum+=n;
        if(sum%2!=0) return false;
        int target=sum/2;
        boolean[] dp=new boolean[target+1]; dp[0]=true;
        for(int n:nums) for(int j=target;j>=n;j--) dp[j]|=dp[j-n];
        return dp[target];
    }

    public static void main(String[] args) {
        CanPartitionEqualSubsetBruteForce sol = new CanPartitionEqualSubsetBruteForce();
        System.out.println(sol.canPartition(new int[]{1,5,11,5})); // true
        System.out.println(sol.canPartition(new int[]{1,2,3,5}));  // false
    }
}
