public class PerfectNumber
{
	public static boolean isPerfectNumber(int n)
	{
		int i=0, factor, sum=1;
		for(i=2;i*i<n;i++)
		{
				if(n%i==0)
				{
					sum+=i;
					factor = n/i;
					sum+=factor;
				}
		}
		if(i*i==n)
			sum+=i;
		return (sum==n);
	}
	public static void main(String[] args)
	{
		System.out.println("is perfect 28: "+isPerfectNumber(28));
	}
}