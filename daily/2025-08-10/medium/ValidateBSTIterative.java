/**
 * Problem: Validate Binary Search Tree [Iterative]
 * Link:    https://leetcode.com/problems/validate-binary-search-tree/
 * Level:   Medium
 * Topic:   Trees, DFS
 *
 * Approach: Iterative implementation — equivalent logic using explicit stack/loop.
 * Time:  O(n)
 * Space: O(h)
 */

public class ValidateBSTIterative {

    static class TreeNode { int val; TreeNode left,right; TreeNode(int v){val=v;} }
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean validate(TreeNode node, long min, long max) {
        if (node==null) return true;
        if (node.val<=min||node.val>=max) return false;
        return validate(node.left,min,node.val) && validate(node.right,node.val,max);
    }

    public static void main(String[] args) {
        ValidateBSTIterative sol = new ValidateBSTIterative();
        TreeNode root=new TreeNode(2);
        root.left=new TreeNode(1); root.right=new TreeNode(3);
        System.out.println(sol.isValidBST(root)); // true
    }
}
