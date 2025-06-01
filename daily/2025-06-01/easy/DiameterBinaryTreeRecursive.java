/**
 * Problem: Diameter of Binary Tree [Recursive]
 * Link:    https://leetcode.com/problems/diameter-of-binary-tree/
 * Level:   Easy
 * Topic:   Trees, DFS
 *
 * Approach: Recursive decomposition — divide into subproblems and combine results.
 * Time:  O(n)
 * Space: O(h)
 */

public class DiameterBinaryTreeRecursive {

    static class TreeNode { int val; TreeNode left,right; TreeNode(int v){val=v;} }
    int maxDia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDia = 0; height(root); return maxDia;
    }
    private int height(TreeNode node) {
        if (node==null) return 0;
        int l=height(node.left), r=height(node.right);
        maxDia=Math.max(maxDia,l+r);
        return 1+Math.max(l,r);
    }

    public static void main(String[] args) {
        DiameterBinaryTreeRecursive sol = new DiameterBinaryTreeRecursive();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2); root.right=new TreeNode(3);
        root.left.left=new TreeNode(4); root.left.right=new TreeNode(5);
        System.out.println(sol.diameterOfBinaryTree(root)); // 3
    }
}
