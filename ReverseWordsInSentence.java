/**
Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".

click to show clarification.

Clarification:
What constitutes a word?
A sequence of non-space characters constitutes a word.
Could the input string contain leading or trailing spaces?
Yes. However, your reversed string should not contain leading or trailing spaces.
How about multiple spaces between two words?
Reduce them to a single space in the reversed string.
*/
public class ReverseWordsInSentence {
    public static String reverseWords(String s) {
        String str = s.trim();
        String[] li = str.split(" ");
        if(li.length==0)
            return "";
        StringBuffer sb = new StringBuffer();
        System.out.println("Length of li: "+li.length);
        for(int i=li.length-1;i>0;i--)
        {
            System.out.println(i+": "+li[i]);
            sb.append(li[i]);
            sb.append(" ");
        }
        sb.append(li[0]);
        return sb.toString();
    }
    public static void main(String[] args)
    {
        System.out.println(reverseWords(" a b"));
    }
}