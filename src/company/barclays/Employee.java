package company.barclays;

public class Employee {
	
	private int id;
	private String name;
	private String phone;
	
	public Employee(int id, String name, String phone){
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee)obj;
		return this.id == emp.id && this.name == emp.name && this.phone == emp.phone;
	}
	
	@Override
	public int hashCode() {
		
		return 15+ id + name.hashCode() + phone.hashCode();
	}

}
