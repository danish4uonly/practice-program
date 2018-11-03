package singleton;



public class AccountCreation {
	
	static int a;

    private static AccountCreation instance;
    //private static volatile AccountCreation instance;
    
    private AccountCreation(){
    	//private because nobody create object of this class from outside
    }

    //use static block
    //use volatile for double locking and checking
       public synchronized static AccountCreation getInstance()
       {
           if (instance==null)
           {
              instance = new AccountCreation();
              System.out.println("AccountCreation Class Object created...!!");
           }
          else{
              System.out.println("AccountCreation Object has already been created so just passed the old reference...!!");
          }
              return instance;
       }

       public void create(int no)
       {
          System.out.println("Account Created Successfully, with Number:" +no);
       }
    
}
