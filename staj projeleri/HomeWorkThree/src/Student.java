
public class Student extends User{

	
	private int studentNumber;
	private String name ;
	
	
	public int getStudentNumber() {
		return studentNumber;
	}


	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Student(int studentNumber, String name) {
		super();
		this.studentNumber = studentNumber;
		this.name = name;
	}


	
}
