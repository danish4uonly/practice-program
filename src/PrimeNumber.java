import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args)
	{
		//A prime number is a whole number greater than 1, whose only two whole-number factors are 1 and itself. 
		//The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23, and 29.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth number :");
		int num = sc.nextInt();
		
		//checkPrimeNumber(num);
		
		int addnum = addPrimeNumber(num);
		System.out.println("Addition of prime number :"+addnum);
		
		System.out.println("Factorail of number :"+factorial(num));
		
		//Addition of two number without using addition operator.
		System.out.println(SumTwoNumber(4,48));
		
	}
	
	//2, 3, 5, 7, 11, ....
	public static boolean isPrime(int number) {

		if (number < 2) return false;
	    if (number == 2) return true;
	    if (number % 2 == 0) return false;
	    for (int i=3; (i*i) <= number; i+=2) {
	        if (number % i == 0 ) return false;
	    }
	    return true;
    }
	
	private static int addPrimeNumber(int num1)
	{
		int sum=0;
		for(int i=2;i<=num1;i++)
		{
			if(checkPrimeNumber(i))
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	
	private static boolean checkPrimeNumber(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if (num%i==0)
			{
				count ++;
			}
		}
		if (count==2)
		{
			//System.out.println("Prime number");
			return true;
		}
		//System.out.println("not");
		return false;
	}
	
	public static int SumTwoNumber(int a , int b)
	{
		int greater,store,smaller,store1,result;
		if(a>b){
			greater=a;
			smaller=b;
		}else{
			greater=b;
			smaller=a;
		}
		store=greater-smaller;
		store1=greater*2;
		result=store1-store;
		return result;
	}
	
	public static int factorial(int N) { 
			if (N == 0) return 0; 
		   if (N == 1) return 1; 
		   return N * factorial(N-1); 
		}
}