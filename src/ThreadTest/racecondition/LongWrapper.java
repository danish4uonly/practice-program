package ThreadTest.racecondition;

public class LongWrapper {
	
	//private Object key = new Object();
	
	private long l;
	
	public LongWrapper(long l){
		this.l=l;
	}
	
	public long getValue(){
		return l;
	}
	
	public void incrementValue(){
		
		l = l + 1; //read and write operation at the same time. race condition occurs.
		
		/**synchronized(key){
			l = l + 1;
		}*/
	}
}
