/*
Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.

For example,

    1
   / \
  2   3
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.

Return the sum = 12 + 13 = 25.
*/

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SumBinaryTreeRootToLeaf {
    public int sumNumbers(TreeNode root) {
        if(root==null)  
            return 0;
        return sumNumbers(root, 0);
    }
    private int sumNumbers(TreeNode node, int previous)
    {
        if(node==null)
            return 0;
        int value = previous*10+node.val;
        if(node.right==null && node.left==null)
        {
            return value;
        }
        return (sumNumbers(node.left,value)+sumNumbers(node.right,value));
    }
}