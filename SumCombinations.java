/*
Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:
All numbers (including target) will be positive integers.
Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
The solution set must not contain duplicate combinations.
For example, given candidate set 2,3,6,7 and target 7, 
A solution set is: 
[7] 
[2, 2, 3] 
*/

public class SumCombinations{
    public static List<List<Integer>> combinationSum(int[] candidates,int target)
	{
		List<List<Integer>> li = new ArrayList<List<Integer>>();
		if(candidates.length!=0)
		{
			li=recursiveHelper(sortAndRemoveDuplicates(candidates),target);
		}
		return li;
	}
	
	public static ArrayList<Integer> sortAndRemoveDuplicates(int[] candidates)
	{
		Arrays.sort(candidates);
		ArrayList<Integer> l = new ArrayList<Integer>();
		int previous=candidates[0];
		l.add(previous);
		for(int i=1;i<candidates.length;i++)
		{
			if(candidates[i]!=previous)
			{
				previous=candidates[i];
				l.add(previous);
			}
		}
		return l;
	}
	
	
	public static List<List<Integer>> recursiveHelper(ArrayList<Integer> candidates, int target) {
		HashSet<List<Integer>> retList = new HashSet<List<Integer>>();
		for(int i=0; i<candidates.size();i++)
		{
			int element = candidates.get(i);
			if(element>target)
				break;
			else if(element<target)
			{
				List<List<Integer>> ret = recursiveHelper(candidates, target-element);
				if(ret.size()!=0)
				{   
					for(List<Integer> list: ret)
					{
						int pos=-1;
						for(int k=0;k<list.size();k++){
							if(list.get(k)>=element){
								pos=k;
								break;
							}
						}
						if(pos!=-1)
							list.add(pos, element);
						else
							list.add(element);
						retList.add(list);
					}
				}
			}
			else
			{
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(element);
				retList.add(list);
			}
		}
		ArrayList<List<Integer>> retL = new ArrayList<List<Integer>>();
		retL.addAll(retList);
		return retL;
	}
}