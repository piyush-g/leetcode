/* Given a collection of numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:
[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
*/

public class PermutationNumbers {
    public List<List<Integer>> permute(int[] num) {
        HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
        set.add(new ArrayList<Integer>());
        for(int i=0;i<num.length;i++)
        {
        	int element = num[i];
        	HashSet<ArrayList<Integer>> nextSet = new HashSet<ArrayList<Integer>>();
        	for(ArrayList<Integer> lst: set)
        	{
        		for(int j=0;j<lst.size();j++)
        		{
        			ArrayList<Integer> nextList = new ArrayList<Integer>();
        			nextList.addAll(lst);
        			nextList.add(j, element);
        			nextSet.add(nextList);
        		}
        		lst.add(element);
        		nextSet.add(lst);
        	}
        	set=nextSet;
        }
        return new ArrayList<List<Integer>>(set);
    }
}