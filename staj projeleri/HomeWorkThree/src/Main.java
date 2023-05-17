

public class Main {

	public static void main(String[] args) {
	
		Instructor instructor1 =new Instructor(245,"betül");
		
		Student student1 = new Student(242,"ali");
		
		User[] users = new User[]{instructor1,student1};
		
		for(User user:users){
            System.out.print(user.getUserNumber());
            System.out.println( " +   " + user.getName());
        }
	}

}
