public final class CreateImmutable{
	
	/*
	 * There are many immutable classes like String, Boolean, Byte, Short, Integer, Long, Float, Double etc. 
	 * In short, all the wrapper classes and String class is immutable. We can also create immutable class by 
	 * creating final class that have final data members as the example given below:
	 */
	/*
	 * 
	 * In this example, we have created a final class named CreateImmutable. 
	 * It have one final datamember, a parameterized constructor and getter method.
	 */
	
	/*
	 * 
	 * Don't provide "setter" methods — methods that modify fields or objects referred to by fields. 
	 * Don't allow subclasses to override methods. The simplest way to do this is to declare the class as final . 
	 * A more sophisticated approach is to make the constructor private and construct instances in factory methods.
	 */
	
	final String pancardNumber;  
	  
	public CreateImmutable(String pancardNumber){  
	this.pancardNumber=pancardNumber;  
	}

	public String getPancardNumber() {
		return pancardNumber;
	}  


	/*
	 * 
	 * 
		The above class is immutable because:
		The instance variable of the class is final i.e. we cannot change the value of it after creating an object.
		The class is final so we cannot create the subclass.
		There is no setter methods i.e. we have no option to change the value of the instance variable.
		These points makes this class as immutable.
	 */
	
}