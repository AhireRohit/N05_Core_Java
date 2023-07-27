package multilevelinheritance;

public class TeamMember extends TeamLead{

	private int duration;
	private int totalmembers;
	
	
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getTotalmembers() {
		return totalmembers;
	}
	public void setTotalmembers(int totalmembers) {
		this.totalmembers = totalmembers;
	}
	@Override
	public String toString() {
		return "TeamMember [duration=" + duration + ", totalmembers=" + totalmembers + ", toString()="
				+ super.toString() + "]";
	}
	public TeamMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeamMember(String deptName, String name, int id, String leadName, int empid, String projectName, int duration, int totalMembers) {
		super(deptName, name, id, leadName, empid, projectName);
		
		this.duration = duration;
		this.totalmembers = totalMembers;
		// TODO Auto-generated constructor stub
	}
	
	
	
}
