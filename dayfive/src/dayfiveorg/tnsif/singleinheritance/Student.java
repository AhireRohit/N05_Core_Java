//This is derived class

package dayfiveorg.tnsif.singleinheritance;

public class Student extends Citizen{
	
//	private data number
	
	private int rollNo;
	private String collegeName;
	public Student() {
		
//		super() --> it calls to parent class default constructor.
		super();
		// TODO Auto-generated constructor stub
	}
	
//	this is parameterized constructor
	public Student(String city, int pincode, long aadharNo, long contactNo, int rollNo, String collegeName) {
		super(city, pincode, aadharNo, contactNo);
		
		this.rollNo = rollNo;
		this.collegeName = collegeName;
		
	
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}
	

}
