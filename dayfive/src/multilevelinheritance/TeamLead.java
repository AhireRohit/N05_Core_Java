//child 2  parent of team member

package multilevelinheritance;

public class TeamLead extends Manager{

//	private data members
	
	private String leadName;
	private int empid;
	private String projectName;
	
	
	
	public TeamLead() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	@Override
	public String toString() {
		return "TeamLead [leadName=" + leadName + ", empid=" + empid + ", projectName=" + projectName + ", toString()="
				+ super.toString() + "]";
	}
	
//	parameterized constructor
	
	public TeamLead(String deptName, String name, int id, String leadName, int empid, String projectName) {
		super(deptName, name, id);
		// TODO Auto-generated constructor stub
		this.empid = empid;
		this.leadName = leadName;
		this.projectName = projectName;
		
	}
	
//	getters and setters
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
}
