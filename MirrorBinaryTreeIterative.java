/* 
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following is not:
    1
   / \
  2   2
   \   \
   3    3

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

public class MirrorBinaryTreeIterative {
    public boolean isSymmetric(TreeNode root) 
    {
        if(root==null)
            return true;
        TreeNode left, right;
        LinkedList<TreeNode> list1 = new LinkedList<TreeNode>();
        LinkedList<TreeNode> list2 = new LinkedList<TreeNode>();
        list1.add(root.left);
        list2.add(root.right);
        while(!list1.isEmpty() && !list2.isEmpty())
        {
            left = list1.pop();
            right = list2.pop();
            
            if(left==null && right==null)
                continue;
            if(left==null || right==null)
                return false;
            if(left.val != right.val)
                return false;
            list1.add(left.left);
            list1.add(left.right);
            list2.add(right.right);
            list2.add(right.left);
        }
        return true;
    }
}
