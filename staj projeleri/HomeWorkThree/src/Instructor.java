
public class Instructor extends User{
	private int instructorNumber;
	private String name ;

public Instructor() {
		
	}


public int getInstructorNumber() {
	return instructorNumber;
}


public void setInstructorNumber(int instructorNumber) {
	this.instructorNumber = instructorNumber;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public Instructor(int instructorNumber, String name) {
	super();
	this.instructorNumber = instructorNumber;
	this.name = name;
}


	
}
