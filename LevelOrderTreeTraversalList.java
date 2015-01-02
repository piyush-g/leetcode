/**
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
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
public class LevelOrderTreeTraversalList {
    public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		if(root!=null)
		    levelOrder(root, l, 0);
		return l;
    }
	
	public void levelOrder(TreeNode root, List<List<Integer>> l, int level)
	{
	    if(root==null)
	        return;
		List<Integer> li;
		if(level>l.size()-1){
			li = new ArrayList<Integer>();
			l.add(li);
		}
		else{
			li = l.get(level);
		}
		li.add(root.val);
		levelOrder(root.left,l,level+1);
		levelOrder(root.right,l,level+1);
	}
}