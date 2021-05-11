package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Student student1=new Student();
		student1.courses="java";
		student1.name="Furkan";
		student1.surname="Bakal";
		
		User admin=new User(1,"f.bakal1997@gmail.com");
		System.out.println(admin.getEmail());

		student1.setEmail("bakal_furkan@hotmail.com");
		System.out.println("NUMARANIZ: " +student1.getId());
		
		StudentManager studentManager=new StudentManager();
		studentManager.activeCourses(student1);
		System.out.println(student1.name+ " adlı öğrencinin numarası: " +studentManager.studentNumber(student1));

		Instructor instructor1=new Instructor();
		instructor1.setId(1);
		instructor1.setEmail("engin.demiroq@gmail.com");
		
		instructor1.name="Engin";
		instructor1.surname="Demiroğ";
		instructor1.educations= new String[]{"Java","REACT","ANGULAR","C#"};
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.givenEducations(instructor1);
}
}