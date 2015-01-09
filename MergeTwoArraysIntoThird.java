public class MergeTwoArraysIntoThird
{
	public static int[] merge(int[] a, int[] b)
	{
		int i=0,j=0,k=0;
		int[] c = new int[a.length+b.length];
		for(k=0;k<(a.length+b.length);k++)
		{
			if(j>=b.length || (i<a.length && a[i]<=b[j]))
			{
				System.out.println("from A: index: "+i+" element: "+a[i]);
				c[k]=a[i++];
				//System.out.println("c:"+c[k])
			}
			else if(i>=a.length || (j<b.length && b[j]<a[i]))
			{
				System.out.println("from B: index: "+j+" element: "+b[j]);
				c[k]=b[j++];
			}
		}
		return c;
	}	
	public static void main(String[] args)
	{
		int[] a={1,2,3,4,5,6};
		int[] b={};
		int[] c = merge(a,b);
		for(int i: c)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}