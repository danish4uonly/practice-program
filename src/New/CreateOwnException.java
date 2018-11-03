package New;

public class CreateOwnException extends Exception{
	
	public CreateOwnException(String s){
		super(s);
	}
	
	public static void main(String[] args){
		testException(17);
	}
	
	public static void testException(int age){
		if(age<18){
			try {
				throw new CreateOwnException("Not Valid age");
			} catch (CreateOwnException e) {
				e.printStackTrace();
				}
		}
		else{
			System.out.println("valid age");
		}
	}
}
