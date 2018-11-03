public class MySingleton {
 
    private static MySingleton myObj;

     
    private MySingleton(){
     
    }
     
    public static MySingleton getInstance(){
    	System.out.println(myObj);
        if(myObj == null){
            myObj = new MySingleton();
            System.out.println("asasasas");
        }
        return myObj;
    }
     
    public void testMe(){
        System.out.println("Hey.... it is working!!!");
    }
     
    public static void main(String a[]){
        MySingleton ms = getInstance();
        MySingleton ms2 = getInstance();
        ms2.testMe();
        ms.testMe();
    }
}

class Test123
{
	
}