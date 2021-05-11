package oppýntro;

public class Course {
	
	
	int id;
	String name;
	double price;
	String instructor;
	boolean is_publish;
	double discount;
	double unitPriceAfterDiscount;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int id, String name, double price, String instructor, boolean is_publish, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.instructor = instructor;
		this.is_publish = is_publish;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public boolean isIs_publish() {
		return is_publish;
	}

	public void setIs_publish(boolean is_publish) {
		this.is_publish = is_publish;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return unitPriceAfterDiscount;
	}

	
	
}
