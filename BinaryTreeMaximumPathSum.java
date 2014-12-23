/**
Given a binary tree, find the maximum path sum.

The path may start and end at any node in the tree.

For example:
Given the below binary tree,

       1
      / \
     2   3
Return 6.
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
public class BinaryTreeMaximumPathSum {
    class Node
    {
        int maxSum;
        int sum;
        public Node(int m, int s)
        {
            maxSum = m;
            sum = s;
        }
    }
    
    public int maxPathSum(TreeNode root) {
        if(root==null)
            return 0;
        Node res = maxPathSumHelper(root);
        return res.maxSum;
    }
    
    public Node maxPathSumHelper(TreeNode root)
    {
        if(root == null)
            return new Node(Integer.MIN_VALUE, 0);
        Node left = maxPathSumHelper(root.left);
        Node right = maxPathSumHelper(root.right);
        int maxSum = Math.max(left.maxSum, right.maxSum);
        int sum = Math.max(Math.max(left.sum, right.sum),0)+root.val;
        
        int maxSumHere = root.val+(Math.max(Math.max(Math.max(left.sum,right.sum),left.sum+right.sum),0));

        if(maxSumHere>maxSum)
        {
            return new Node(maxSumHere,sum);
        }
        else
        {
            return new Node(maxSum,sum);
        }
    }
}