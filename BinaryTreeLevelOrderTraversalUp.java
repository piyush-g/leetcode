/*
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
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
public class BinaryTreeLevelOrderTraversalUp {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
		ArrayList<List<Integer>> li = new ArrayList<List<Integer>>();
		levelOrderBottom(root,0,li);
		return li;
	}

	public void levelOrderBottom(TreeNode node, int level, List<List<Integer>> levelList)
	{
		if(node==null)
			return;
		ArrayList<Integer> currLevelList;
		int index = levelList.size()-1-level;
		if(index<0)
		{
			currLevelList = new ArrayList<Integer>();
			levelList.add(0, currLevelList);
		}
		else
		{
			currLevelList = (ArrayList<Integer>) levelList.get(index);
		}
		currLevelList.add(node.val);
		levelOrderBottom(node.left,level+1,levelList);
		levelOrderBottom(node.right, level+1, levelList);
	}
}