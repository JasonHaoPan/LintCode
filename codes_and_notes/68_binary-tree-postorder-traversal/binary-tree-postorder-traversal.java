/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/binary-tree-postorder-traversal
@Language: Java
@Datetime: 17-01-08 00:35
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
     * @return: Postorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null) return list;
        if(root.left != null) list.addAll(postorderTraversal(root.left));
        if(root.right != null) list.addAll(postorderTraversal(root.right));
        list.add(root.val);
        return list;
    }
}