import java.util.Date;


public class TestingPojo
{
	private String fName;
	private Integer rollNo;
	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashCode Method : "+rollNo + " : "+fName);
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rollNo == null) ? 0 : rollNo.hashCode());
		result = prime * result
				+ ((fName == null) ? 0 : fName.hashCode());
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals Method first Value : "+((TestingPojo) obj).rollNo+ " : "+((TestingPojo) obj).fName);
		System.out.println("Equals Method second Value : "+rollNo +" : "+fName);
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		TestingPojo other = (TestingPojo) obj;
			
		if (rollNo == null) {
			if (other.rollNo != null)
				return false;
		} else if (!fName.equals(other.rollNo))
			return false;
		
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		
		return true;
	}
	
	public String toString()
	{
		return "TestingPojo [rollNo=" + rollNo + ", fName=" + fName+ "]" + new Date();
	}
}