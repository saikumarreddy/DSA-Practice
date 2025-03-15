/**
 * Problem: Maximum Depth of Binary Tree [DPMemo]
 * Link:    https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Level:   Easy
 * Topic:   Trees, DFS
 *
 * Approach: DP memoization — top-down recursion with HashMap cache avoids recomputation.
 * Time:  O(n)
 * Space: O(h)
 */

public class MaxDepthBinaryTreeDPMemo {

    static class TreeNode { int val; TreeNode left,right; TreeNode(int v){val=v;} }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        MaxDepthBinaryTreeDPMemo sol = new MaxDepthBinaryTreeDPMemo();
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9); root.right=new TreeNode(20);
        root.right.left=new TreeNode(15); root.right.right=new TreeNode(7);
        System.out.println(sol.maxDepth(root)); // 3
    }
}
