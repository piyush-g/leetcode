/**
Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
*/
public class ExcelColomnToNumber {
  public static int titleToNumber(String s) {
		if(s==null || s.isEmpty())
			return 0;
		int val = 0;
		String str = s.toLowerCase();
		int power = 1,v;
		for(int i=str.length()-1;i>=0;i--)
		{
			v = str.charAt(i)-'a'+1;
			val=val + ( power * v);
			power=26*power;
		}
		return val;
  }

  public static String convertToTitle(int n) {
    StringBuffer sb = new StringBuffer();
    char ch;
    while(n>0)
    {
      ch = (char) ((n-1)%26 + 'A');
      sb.insert(0,ch);
      n=n/26;
    }
    return sb.toString();
    }

  public static void main (String[] args)
  {
   	System.out.println("Value of 535 "+convertToTitle(535));
  }
}