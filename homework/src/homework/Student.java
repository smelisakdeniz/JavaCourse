package homework;

public class Student extends User {
	int student�d;
	// ilerleme y�zdesi
	double studentLevel;

	public Student(int student�d, String nameSurname, String email, String password, double studentLevel) {
		super();
		this.student�d = student�d;
		this.studentLevel = studentLevel;
	}

	public int getStudent�d() {
		return student�d;
	}

	public void setStudent�d(int student�d) {
		this.student�d = student�d;
	}

	public void setStudentLevel(double studentLevel) {
		this.studentLevel = studentLevel;
	}
}
