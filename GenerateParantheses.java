/**
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

"((()))", "(()())", "(())()", "()(())", "()()()"
*/
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
public class GenerateParantheses {
    
    public static List<String> generateParenthesis(int n) {
        Set<String> set = new HashSet<String>();
        set.add("");
        for(int i=0;i<n;i++)
        {
        	Set<String> nextSet = new HashSet<String>();
        	for(String str: set)
        	{
        		for(int j=0;j<=str.length();j++)
        		{
                    nextSet.add(str.substring(0, j)+"()"+str.substring(j, str.length()));
        		}
        	}
        	set = nextSet;
        }
        return (new ArrayList<String>(set));
    }

    public static void main(String[] args)
    {
        System.out.println("Parantheses for: ");
        List<String> pars = generateParenthesis(3);
        for(String s: pars)
        {
            System.out.print(s+" ");
        }
        System.out.println("");
    }
}