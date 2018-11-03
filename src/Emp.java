
public class Emp {
	
	private int age;
	
	public Emp(int age)
	{
		super();
		this.age=age;
		System.out.println("Argumented Contructor : "+age);
	}
	
	public int hashCode()
	{
		System.out.println("hashCode : "+age);
		return age;
	}

	public boolean equals( Object obj )
	{
		boolean flag = false;
		Emp emp = ( Emp )obj;
		System.out.println("toString : "+"second : "+emp.age+" First: "+age);
		if( emp.age == age )
			flag = true;
		return flag;
	}
}
