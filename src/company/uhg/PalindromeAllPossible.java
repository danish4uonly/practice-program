package company.uhg;

public class PalindromeAllPossible {

	public static void main(String[] args) {
		
		String s = "ABABABAABBAADD";
		printAllPosiblePalindrome(s);

	}
	
	public static void printAllPosiblePalindrome(String s){
		
		for(int i = 0 ; i < s.length() ; i++){
			for(int j = 1 ; j < s.length() ; j++){
				String str = s.substring(i, j + 1);
				if(checkPalindrome(str)){
					System.out.println(str);
				}
			}
		}
		
	}
	
	public static boolean checkPalindrome(String s){
		for(int i = 0 ; i < s.length() / 2 ; i++){
			if(s.charAt(i)!=s.charAt(s.length() - 1 - i)){
				return false;
			}
		}
		return true;
	}

}
