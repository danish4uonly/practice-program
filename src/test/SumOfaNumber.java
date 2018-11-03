package test;

public class SumOfaNumber {
	
	public static void main(String[] args){
		
		int num=6514,digit,sum=0,rev=0;
		
		//sum of all digit
		/*while(num!=0){
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println(sum);*/
		
		//reverse of number.
		/*while(num!=0){
			digit=num%10;
			num=num/10;
			rev=rev*10+digit;
		}
		System.out.println(rev);*/
		
		String temp = Integer.toString(num);
		//int[] newGuess = new int[temp.length()];
		for(int i =0;i<temp.length();i++){		    
			sum=sum+(temp.charAt(i)-'0'); 
		}
		System.out.println(sum);
		
		//converting string into string array.
		/*String s="abcdef";
		String[] str = new String[s.length()];
		for(int j = 0;j<str.length;j++){
			str[j]=String.valueOf(s.charAt(j));
			System.out.println(str[j]);
		}*/
		
		
	}

}
