/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/minimum-depth-of-binary-tree
@Language: Java
@Datetime: 17-01-17 21:45
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
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public int minDepth(TreeNode root) {
        // write your code here
        if(root == null){
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(root.left == null && root.right == null)
            return 1;
        if(root.left == null && root.right != null)
            return right + 1;
        if(root.left != null && root.right == null)
            return left + 1;
        return left < right ? left + 1 : right + 1;
    }
}