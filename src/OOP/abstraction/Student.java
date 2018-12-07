package OOP.abstraction;

public class Student {
	private String StName;
	private int StID;
	private String StDOB;
	
	public Student() {}
	public Student(String stName, int stID, String stDOB) {
		this.StName = stName;
		this.StID = stID;
		this.StDOB = stDOB;
	}
	public String getStName() {
		return StName;
	}
	public void setStName(String stName) {
		StName = stName;
	}
	public int getStID() {
		return StID;
	}
	public void setStID(int stID) {
		StID = stID;
	}
	public String getStDOB() {
		return StDOB;
	}
	public void setStDOB(String stDOB) {
		StDOB = stDOB;
	}
	
	
	
	

}
