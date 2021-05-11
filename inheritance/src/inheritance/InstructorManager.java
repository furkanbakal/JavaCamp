package inheritance;

public class InstructorManager {
	
	public void givenEducations(Instructor instructor) {
	
		for(String educations :instructor.educations) {
			System.out.println(instructor.name+ " Educations: "+educations);
		}
	}
}
