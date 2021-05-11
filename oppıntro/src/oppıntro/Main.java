package oppýntro;

public class Main {

	public static void main(String[] args) {
	
		Course course1=new Course(1, "JAVA", 46.99, "ENGÝN DEMÝROÐ", true,20);
		
		
		Course course2=new Course();
		course2.id=2;
		course2.name="REACT";
		course2.price=53.59;
		course2.instructor="Engin DEMÝROÐ";
		course2.is_publish=true;
		course2.discount=10.00;
		course2.unitPriceAfterDiscount=35.99;
		
		Course course3=new Course();
		course3.id=3;
		course3.name="PHP";
		course3.price=46.99;
		course3.is_publish=false;
		
		Course [] courses= {course1,course2,course3};
		
		for(Course course:courses) {
			System.out.println(course.id);
			System.out.println(course.name);
			System.out.println(course.price);
			System.out.println(course.instructor);
			System.out.println("**********");
		}
		
		System.out.println(courses.length);
		
		CourseService courseService=new CourseService();
		courseService.addToCart();
		courseService.removeCart(course3);
	}

}
