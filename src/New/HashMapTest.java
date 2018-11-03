package New;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		HashMap<Student, String> hm = new HashMap<Student, String>();
		
		Student s1 = new Student("101","Danish");
		Student s2 = new Student("101","Danish");
		
		hm.put(s1, "ABC");
		hm.put(s2, "ABCD");
		
		for(Map.Entry<Student, String> m : hm.entrySet()){
			System.out.println(m.getValue());
		}
	}	
}

class Student{
	private String stdId;
	private String stdName;
	
	public Student(String stdId, String stdName){
		super();
		this.stdId=stdId;
		this.stdName=stdName;
	}
	
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof Student))
			return false;
		if(obj==null)
			return false;
		if(obj==this)
			return true;
		return this.stdId == ((Student) obj).stdId && this.stdName == ((Student) obj).stdName;
	}
	
	@Override
	public int hashCode() {
		final int prime=31;
		int result=1;
		result = prime * result + (this.stdId == null ? 0 : this.stdId.hashCode());
		result = prime * result + (this.stdName == null ? 0 : this.stdName.hashCode());
		return result;
	}
}