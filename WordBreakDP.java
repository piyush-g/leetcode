public boolean wordBreak(String s, Set<String> dict) {
	if(s==null || dict.size()==0)
		return false;
	if(s.isEmpty())
		return true;
    for(int i=s.length();i>=0;i--)
    {
    	if(dict.contains(s.substring(0,i)))
    	{
    		if(wordBreak(s.substring(i, s.length()), dict))
    			return true;
    	}
    }
    return false;
}