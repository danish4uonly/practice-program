package ThreadTest.racecondition;

public class RaceCondition {
	
	public static void main(String[] args) throws InterruptedException {
		
		LongWrapper lw = new LongWrapper(0L);
		
		Runnable r = () -> {
			
			for(int i= 0 ; i < 1_000 ; i++){
				lw.incrementValue();
			}
		};
		
		/**Thread t = new Thread(r);
		t.start();
		
		t.join();
		
		System.out.println("Value = " + lw.getValue()); // value is 1000 which is expected.
		*
		*/
		//Now i will use thousand thread.
		
		Thread[] t = new Thread[1_000];
		for(int i = 0 ; i < t.length ; i++){
			t[i] = new Thread(r);
			t[i].start();
		}
		
		for(int i = 0 ; i < t.length ; i++){
			t[i].join();
		}
		
		System.out.println("Value = " + lw.getValue()); // value is 982155 , 987714 , 981845 .. which is race condition.
		//expected out put should be 1000000. to make it make synchronized in longwrapper.
	}
}
