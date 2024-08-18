/**
 * Problem: Binary Tree Maximum Path Sum [Opt]
 * Link:    https://leetcode.com/problems/binary-tree-maximum-path-sum/
 * Level:   Hard
 * Topic:   Trees, DFS
 *
 * Approach: Optimized approach — improved space/time complexity over the basic solution.
 * Time:  O(n)
 * Space: O(h)
 */

public class BinaryTreeMaxPathSumOpt {

    static class TreeNode { int val; TreeNode left,right; TreeNode(int v){val=v;} }
    int maxPath;
    public int maxPathSum(TreeNode root) {
        maxPath=Integer.MIN_VALUE; gain(root); return maxPath;
    }
    private int gain(TreeNode node) {
        if (node==null) return 0;
        int l=Math.max(0,gain(node.left)), r=Math.max(0,gain(node.right));
        maxPath=Math.max(maxPath,node.val+l+r);
        return node.val+Math.max(l,r);
    }

    public static void main(String[] args) {
        BinaryTreeMaxPathSumOpt sol = new BinaryTreeMaxPathSumOpt();
        TreeNode root=new TreeNode(-10);
        root.left=new TreeNode(9); root.right=new TreeNode(20);
        root.right.left=new TreeNode(15); root.right.right=new TreeNode(7);
        System.out.println(sol.maxPathSum(root)); // 42
    }
}
