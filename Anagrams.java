/**
Given an array of strings, return all groups of strings that are anagrams.

Note: All inputs will be in lower-case.
*/
public class Anagrams {
    public List<String> anagrams(String[] strs) {
        ArrayList<String> list = new ArrayList<String>();
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        if(strs.length==0)
            return list;
        ArrayList<String> li;
        for(String str: strs)
        {
            if(str==null)
        		continue;
            String key = sort(str);
            if(map.containsKey(key))
            {
            	li = map.get(key);
            	li.add(str);
            }
            else
            {
            	li = new ArrayList<String>();
            	li.add(str);
            	map.put(key, li);
            }
        }
        for(Map.Entry<String, ArrayList<String>> entry: map.entrySet())
        {
        	ArrayList<String> l = entry.getValue();
        	if(l.size()>1)
        	{
	        	for(String s: l){
	        		list.add(s);
	        	}
        	}
        }
        return list;
    }
	public String sort(String s)
	{
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
}