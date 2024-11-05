/**
 * Problem: Number of Provinces [BruteForce]
 * Link:    https://leetcode.com/problems/number-of-provinces/
 * Level:   Medium
 * Topic:   Graphs, DFS, Union Find
 *
 * Approach: Brute force — nested iteration for clarity; useful as a baseline comparison.
 * Time:  O(n^2)
 * Space: O(n)
 */

public class NumberOfProvincesBruteForce {

    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length, count=0;
        boolean[] visited=new boolean[n];
        for (int i=0;i<n;i++) if(!visited[i]) { dfs(isConnected,visited,i); count++; }
        return count;
    }
    private void dfs(int[][] g, boolean[] vis, int i) {
        vis[i]=true;
        for (int j=0;j<g.length;j++) if(!vis[j]&&g[i][j]==1) dfs(g,vis,j);
    }

    public static void main(String[] args) {
        NumberOfProvincesBruteForce sol = new NumberOfProvincesBruteForce();
        System.out.println(sol.findCircleNum(new int[][]{{1,1,0},{1,1,0},{0,0,1}})); // 2
        System.out.println(sol.findCircleNum(new int[][]{{1,0,0},{0,1,0},{0,0,1}})); // 3
    }
}
