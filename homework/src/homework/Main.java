package homework;

public class Main {

	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		Student student = new Student(1,"�afak Melis AKDEN�Z","smelisakdeniz@gmail.com",
				"123456", 41);
		
		student.id=1;
		student.nameSurname= "�afak Melis AKDEN�Z";
		student.email= "smelisakdeniz@gmail.com";
		student.password="123456";
		student.studentLevel=41;
		
		studentManager.add(student);
		
		
		
		InstructorManager instructorManager = new InstructorManager();
		Instructor instructor = new Instructor(1, "Engin Demiro�", "engindemirog@gmail.com","123456");
		
		instructor.id=1;
		instructor.nameSurname="Engin Demiro�";
		instructor.email="engindemirog@gmail.com";
		instructor.password="123456";
			
		System.out.print("E�itmen: " );
		instructorManager.add(instructor);
		
	}


}
