/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/clone-binary-tree
@Language: Java
@Datetime: 17-01-04 21:19
*/

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param root: The root of binary tree
     * @return root of new tree
     */
    public TreeNode cloneTree(TreeNode root) {
        // Write your code here
        if(root == null) return null;
        TreeNode dst = new TreeNode(0);
        dst.val = root.val;
        dst.left = cloneTree(root.left);
        dst.right = cloneTree(root.right);
        return dst;
    }
}