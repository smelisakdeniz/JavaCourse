
public class Main {

	public static void main(String[] args) {
		
		StudentManager studentManager = new StudentManager();
		Student student = new Student(1,"Şafak Melis AKDENİZ","smelisakdeniz@gmail.com",
				"123456", 41);
		
		student.id=1;
		student.nameSurname= "Şafak Melis AKDENİZ";
		student.email= "smelisakdeniz@gmail.com";
		student.password="123456";
		student.studentLevel=41;
		
		studentManager.add(student);
		
		
		
		İnstructorManager instructorManager = new İnstructorManager();
		İnstructor instructor = new İnstructor(1, "Engin Demiroğ", "engindemirog@gmail.com","123456");
		
		instructor.id=1;
		instructor.nameSurname="Engin Demiroğ";
		instructor.email="engindemirog@gmail.com";
		instructor.password="123456";
			
		System.out.print("Eğitmen: " );
		instructorManager.add(instructor);
		
	}

}