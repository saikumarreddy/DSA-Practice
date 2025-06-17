/**
 * Problem: Decode Ways [Recursive]
 * Link:    https://leetcode.com/problems/decode-ways/
 * Level:   Medium
 * Topic:   DP, Strings
 *
 * Approach: Recursive decomposition — divide into subproblems and combine results.
 * Time:  O(n)
 * Space: O(n)
 */

public class DecodeWaysRecursive {

    public int numDecodings(String s) {
        int n=s.length();
        int[] dp=new int[n+1]; dp[0]=1; dp[1]=s.charAt(0)=='0'?0:1;
        for(int i=2;i<=n;i++) {
            int one=s.charAt(i-1)-'0';
            int two=Integer.parseInt(s.substring(i-2,i));
            if(one>=1) dp[i]+=dp[i-1];
            if(two>=10&&two<=26) dp[i]+=dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        DecodeWaysRecursive sol = new DecodeWaysRecursive();
        System.out.println(sol.numDecodings("12"));  // 2
        System.out.println(sol.numDecodings("226")); // 3
        System.out.println(sol.numDecodings("06"));  // 0
    }
}
