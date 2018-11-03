
public class Test123 {
	public static void main(String[] args) {
		/*System.out.println("234234");
		
		String s1 = new String("Hello");
		String s2 = new String("there");
		String s3 = new String();
		System.out.println(s3=s1+s2);
		//System.out.println(s3=s1-s2);
		//System.out.println(s3=s1&&s2);
		 * 
		 * 
*/	
		
	int a[] = {1};
	
	Test123 f = new Test123();
	f.increment(a);
	System.out.println(a[a.length-1]);
	
	}
	
	void increment(int[] i){
		i[i.length-1]++;
		
	}
}
