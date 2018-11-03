public class ConstructorTest
{
    public ConstructorTest() throws InterruptedException
    {
        System.out.println("Preparing object....");
        Thread.sleep(1000);
        System.out.println("Object ready");
        throw new InterruptedException("sorry device error");  
    }

    public static void main(String ... args)
    {
        try
        {
            ConstructorTest test = new ConstructorTest();
        }
        catch (InterruptedException e)
        {
            System.out.println("Got interrupted...");
        }
    }
}