import java.util.Scanner;

public class StairCaseProblem
{

		static int numWays(int n)
		{
			if(n<=0)
			{ 
				return 0;
			}
		
			if(n==1) 
			{
				return 1;
			}
			if(n==2) 
			{
				return 2; 
			}
			else 
			{
				return numWays(n-1)+numWays(n-2); 
			} 
	}
		
		static int fibonacciSeries(int n)
		{
			int f1=0,f2=1,f,count;
			
			System.out.print(0+" "+1);
			for(count=3;count<=n;count++)
			{
				f=f1+f2;
				f1=f2;
				f2=f;
				System.out.print(" "+f);
			}
			
			return n;
			
		}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number :");
		int n = sc.nextInt();
		//int f =numWays(n);
		fibonacciSeries(n);
		//System.out.println(f);
	}
}