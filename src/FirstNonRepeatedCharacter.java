public class FirstNonRepeatedCharacter
{
	
	public static String Test()
	{
		String name="mohammad nasim ali";
		//ilamisan damma hom 
		

		StringBuilder sb = new StringBuilder(name);
		String m1 = sb.reverse().toString();
		String m2= m1.replaceAll(" ", "");
		StringBuilder sBuild=new StringBuilder(m2);
		System.out.println(m2);
		
		String[] se = name.split(" ");
		int len = se.length;
		String finalStr = "";
		for(int i=0; i<=len-1; i++)
		{
			String se1 = se[i];
			int leng = se1.length();
			
			for(int j=0; j<leng; j++)
			{
				finalStr +=sBuild.charAt(j); 
				System.out.println("sBuild.charAt(j) j: "+j+" -: "+sBuild.charAt(j));
				//sBuild.deleteCharAt(j);
			}
			finalStr=finalStr+" ";
			
			//System.out.println();
		}
		System.out.println(finalStr);
		
		
		return"";
	}

	public static void main(String[] args)
	{
		Test();
	}
}
