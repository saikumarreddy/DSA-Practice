/**
 * Problem: Coin Change [Recursive]
 * Link:    https://leetcode.com/problems/coin-change/
 * Level:   Medium
 * Topic:   DP
 *
 * Approach: Recursive decomposition — divide into subproblems and combine results.
 * Time:  O(n*amount)
 * Space: O(amount)
 */
import java.util.Arrays;

public class CoinChangeRecursive {

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0]=0;
        for (int i=1;i<=amount;i++)
            for (int c:coins) if(c<=i) dp[i]=Math.min(dp[i],dp[i-c]+1);
        return dp[amount]>amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        CoinChangeRecursive sol = new CoinChangeRecursive();
        System.out.println(sol.coinChange(new int[]{1,5,11},11)); // 1 (11 itself -- wait, no: 11=11, so 1 coin... but coins are {1,5,11}... yes 1)
        System.out.println(sol.coinChange(new int[]{1,5,11},15)); // 3 (11+1+...wait: 5+5+5=15, so 3)
        System.out.println(sol.coinChange(new int[]{2},3));       // -1
    }
}
