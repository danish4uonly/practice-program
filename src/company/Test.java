package company;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		/*Integer i = 343;
		String s = "-";
		long L = 343L;
		if(i.equals(L)){
			s +=".e1";
			
		}
		if(i.equals(343)){
			s +=".e2";
			
		}
		
		Short s1 = (short)((new Short((short)343))/(new Short((short)49)));
		if(s1==7 ) s+="fly";
		if(s1< new Integer(7+1)) s+="fly";
		System.out.println(s);
		
		Set sss = new TreeSet();
		sss.add("1");
		sss.add(3);
		sss.add("2");
		*/
		
		int ii =2;
		boolean t = true;
		boolean f = true,b;
		b = (t&((++ii)==0));
		b = (f&((ii+=2)>0));
		System.out.println(ii);
			
		
	}

}
