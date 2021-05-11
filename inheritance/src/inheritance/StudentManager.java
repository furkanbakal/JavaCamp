package inheritance;

public class StudentManager {
	
	public void activeCourses(Student student) {
		System.out.println("Kursu başarılı bir şekilde aldınız:" +student.courses);
	}
	
	public int studentNumber(Student student) {
		return student.getId();
	}
}
