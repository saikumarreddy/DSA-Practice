/**
 * Problem: Number of Provinces [DFS]
 * Link:    https://leetcode.com/problems/number-of-provinces/
 * Level:   Medium
 * Topic:   Graphs, DFS, Union Find
 *
 * Approach: DFS traversal — depth-first exploration with backtracking on dead ends.
 * Time:  O(n^2)
 * Space: O(n)
 */

public class NumberOfProvincesDFS {

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
        NumberOfProvincesDFS sol = new NumberOfProvincesDFS();
        System.out.println(sol.findCircleNum(new int[][]{{1,1,0},{1,1,0},{0,0,1}})); // 2
        System.out.println(sol.findCircleNum(new int[][]{{1,0,0},{0,1,0},{0,0,1}})); // 3
    }
}
