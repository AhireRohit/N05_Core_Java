//parent class 1 or super class 1

package multilevelinheritance;

public class Manager {

	private String deptName;
	private String name;
	private int id;
	
	public Manager() {
		System.out.println("Default constructor manager!");
		// TODO Auto-generated constructor stub
	}
	
	public Manager(String deptName, String name, int id) {
		super();
		this.deptName = deptName;
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Manager [deptName=" + deptName + ", name=" + name + ", id=" + id + "]";
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
