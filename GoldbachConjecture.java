/** 
Goldbach's conjecture : Every even integer greater than 2 can be expressed as the sum of two primes. 
Write a function which takes a number as input, verify if is an even number greater than 2 and also print 
atleast one pair of prime numbers.
 */

public class GoldbachConjecture
{
	public static void printPrimes(int n)
	{
		if(n%2!=0)
			return;
		boolean[] compositeNumbers = new boolean[n+1];
		int i=0;
		compositeNumbers[1]=true;
		for(i=0;i<=n;i=i+2)
		{
			compositeNumbers[i]=true;
		}
		compositeNumbers[2]=false;
		
		for(i=3;i*i<n;i=i+2)
		{
			if(!compositeNumbers[i]){
				for(int j=i;j*i<=n;j=j+2)
				{
					compositeNumbers[j*i]=true;
				}
			}
		}
		i=2;
		if(!compositeNumbers[i] && !compositeNumbers[n-i])
			System.out.println("Found Pairs: "+i+" & "+(n-i));
		
		for(i=3;i<=n/2;i=i+2)
		{
			if(!compositeNumbers[i] && !compositeNumbers[n-i])
				System.out.println("Found Pairs: "+i+" & "+(n-i));
		}
	}
	public static void main(String[] args)
	{
		printPrimes(100);
	}
}