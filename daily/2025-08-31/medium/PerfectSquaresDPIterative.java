/**
 * Problem: Perfect Squares [Iterative]
 * Link:    https://leetcode.com/problems/perfect-squares/
 * Level:   Medium
 * Topic:   DP, Math
 *
 * Approach: Iterative implementation — equivalent logic using explicit stack/loop.
 * Time:  O(n*sqrt(n))
 * Space: O(n)
 */
import java.util.Arrays;

public class PerfectSquaresDPIterative {

    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<=n;i++)
            for(int j=1;j*j<=i;j++)
                dp[i]=Math.min(dp[i],dp[i-j*j]+1);
        return dp[n];
    }

    public static void main(String[] args) {
        PerfectSquaresDPIterative sol = new PerfectSquaresDPIterative();
        System.out.println(sol.numSquares(12)); // 3 (4+4+4)
        System.out.println(sol.numSquares(13)); // 2 (4+9)
    }
}
