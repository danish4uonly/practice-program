

public class AccountCreation {
	
	static int a;

    private static AccountCreation instance;
    //private static volatile AccountCreation instance;

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
