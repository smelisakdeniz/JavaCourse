package homework;

public class Instructor extends User {
 int instructorĘd;
	

	
	public Instructor(int instructorĘd, String nameSurname, String email , String password) {
		super();
		this.instructorĘd = instructorĘd;
	}

	public int getInstructorĘd() {
		return instructorĘd;
	}

	public void setInstructorĘd(int instructorĘd) {
		this.instructorĘd = instructorĘd;
	}
}
