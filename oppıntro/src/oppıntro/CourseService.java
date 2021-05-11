package oppýntro;

public class CourseService {
	
	public void addToCart() {
		System.out.println("Kurs baþarýyla sepete eklendi.");
	}
	
	public void removeCart(Course course) {
		System.out.println(course.name +" baþarýyla sepetten kaldýrýldý.");
	}
	
}
