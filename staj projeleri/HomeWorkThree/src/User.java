
public class User {
	String Name;
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	int id;
	int userNumber;	
	
public User() {
		
	}

public User(String name, int id, int userNumber) {
	super();
	Name = name;
	this.id = id;
	this.userNumber = userNumber;
}

	
}
