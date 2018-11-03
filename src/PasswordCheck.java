import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheck {

	public static void main(String[] args) {
		
		
		System.out.println(Password_Validation("aAaaaa6@"));

	}
	
	
	public static boolean Password_Validation(String password) 
	{

	    if(password.length()>=6)
	    {
	        Pattern lower = Pattern.compile("[a-z]");
	        Pattern upper = Pattern.compile("[A-z]");
	        Pattern digit = Pattern.compile("[0-9]");
	        Pattern special = Pattern.compile ("[!#$*]");


	           Matcher hasLower = lower.matcher(password);
	           Matcher hasUpper = upper.matcher(password);
	           Matcher hasDigit = digit.matcher(password);
	           Matcher hasSpecial = special.matcher(password);

	           if(hasLower.find() && hasUpper.find() && hasDigit.find() && hasSpecial.find())
	        	   System.out.println("very strong");
	           if((!hasLower.find() && hasUpper.find() && hasDigit.find() && hasSpecial.find())
	        		|| (hasLower.find() && !hasUpper.find() && hasDigit.find() && hasSpecial.find())   
	        		   
	        		|| (hasLower.find() && hasUpper.find() && !hasDigit.find() && hasSpecial.find()) 
	        		
	        		|| (hasLower.find() && hasUpper.find() && hasDigit.find() && !hasSpecial.find())  
	        		   )
	        	   System.out.println("strong");
	           
	           if((hasLower.find() && hasUpper.find() && !hasDigit.find() && !hasSpecial.find())
		        		|| (hasLower.find() && !hasUpper.find() && hasDigit.find() && !hasSpecial.find())   
		        		   
		        		|| (hasLower.find() && !hasUpper.find() && !hasDigit.find() && hasSpecial.find()) 
		        		
		        		|| (!hasLower.find() && hasUpper.find() && hasDigit.find() && !hasSpecial.find())  
		        		
		        		|| (!hasLower.find() && hasUpper.find() && !hasDigit.find() && hasSpecial.find()) 
		        		
		        		|| (!hasLower.find() && !hasUpper.find() && hasDigit.find() && hasSpecial.find())  
		        		   )
		        	   System.out.println("weak");
	           
	           if((hasLower.find() && !hasUpper.find() && !hasDigit.find() && !hasSpecial.find())
		        		|| (!hasLower.find() && hasUpper.find() && !hasDigit.find() && !hasSpecial.find())   
		        		   
		        		|| (!hasLower.find() && !hasUpper.find() && hasDigit.find() && !hasSpecial.find()) 
		        		
		        		|| (!hasLower.find() && !hasUpper.find() && !hasDigit.find() && hasSpecial.find())  
		        		   )
		        	   System.out.println("very weak");
	           
	           
	           return true;

	    }
	    else{
	    	System.out.println("Password should be more than 5 letter");
	        return false;
	    }

	}

}
