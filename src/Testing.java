import java.util.HashMap;

class BCF {
	
	protected void volume(){
		System.out.println("hhhhhh");
	}
}

public class Testing
{
	public static void main(String[] args)
	{
		Long maxMemory = Runtime.getRuntime().maxMemory();
		
		System.out.println(maxMemory);
		
        int[] matrix = new int[(int) (maxMemory + 1)];

        for(int i = 0; i < matrix.length; ++i)

            matrix[i] = i+1;
		
		/*int[] mem = new int[5];
		for(int i=0;i<6;i++){
			mem[i]=i;
		}*/
	      
		int ab_1;
		int abc_d;
		int $124;
		BCF b = new BCF();
		b.volume();
		
		TestingPojo tp = new TestingPojo();
		TestingPojo tp1 = new TestingPojo();
		tp.setfName("ABC");
		tp.setRollNo(1234);
		System.out.println(tp);
		System.out.println(tp1);
		
		TestingPojo tp2 = new TestingPojo();
		tp2.setfName("Ali");
		tp2.setRollNo(53);
		
		HashMap<TestingPojo,String> hm = new HashMap<TestingPojo,String>();
		hm.put(tp, "A");
		//hm.put(new TestingPojo(), "A");
		boolean bool=tp2.equals(tp);
		System.out.println("bool: "+bool);
		
		
		System.out.println("Hello World".substring(0, 4));
	}
	public static native void amethod();
}