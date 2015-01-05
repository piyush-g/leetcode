
/**
Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code".
*/
public class WordBreakDP
{
    public boolean wordBreak(String s, Set<String> dict) {
        if(s==null || dict.size()==0)
            return false;
        boolean[] isConstructedTill = new boolean[s.length()+1];
        isConstructedTill[0]=true;
        for(int i=1;i<=s.length();i++)
        {
            for(int j=0;j<i;j++)
            {
                if(isConstructedTill[j] && dict.contains(s.substring(j, i))){
                    isConstructedTill[i]=true;
                    break;
                }
            }
        }
        return isConstructedTill[s.length()];
    }

    /*alternative solution but previous one is better*/
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
}