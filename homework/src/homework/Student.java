package homework;

public class Student extends User {
	int studentİd;
	// ilerleme yüzdesi
	double studentLevel;

	public Student(int studentİd, String nameSurname, String email, String password, double studentLevel) {
		super();
		this.studentİd = studentİd;
		this.studentLevel = studentLevel;
	}

	public int getStudentİd() {
		return studentİd;
	}

	public void setStudentİd(int studentİd) {
		this.studentİd = studentİd;
	}

	public void setStudentLevel(double studentLevel) {
		this.studentLevel = studentLevel;
	}
}
