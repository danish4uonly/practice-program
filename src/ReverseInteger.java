import java.util.Scanner;

class ReverseInteger {
public static int reverse(int x) {
    int rev = 0;
    while(x != 0){
        rev = rev*10 + x%10;
        x = x/10;
    }
 
    return rev;
}

public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number :");
	int val = sc.nextInt();
	int reverse = reverse(val);
	System.out.println("Reverse number is :"+reverse);	
	if (val==reverse)
	{
		System.out.println("The given number is palindrome.");
	}
	else
	{
		System.out.println("The given number is not palindrome.");
	}
}
}