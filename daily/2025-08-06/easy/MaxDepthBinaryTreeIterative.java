/**
 * Problem: Maximum Depth of Binary Tree [Iterative]
 * Link:    https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Level:   Easy
 * Topic:   Trees, DFS
 *
 * Approach: Iterative implementation — equivalent logic using explicit stack/loop.
 * Time:  O(n)
 * Space: O(h)
 */

public class MaxDepthBinaryTreeIterative {

    static class TreeNode { int val; TreeNode left,right; TreeNode(int v){val=v;} }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        MaxDepthBinaryTreeIterative sol = new MaxDepthBinaryTreeIterative();
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9); root.right=new TreeNode(20);
        root.right.left=new TreeNode(15); root.right.right=new TreeNode(7);
        System.out.println(sol.maxDepth(root)); // 3
    }
}
