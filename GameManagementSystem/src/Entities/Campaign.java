package Entities;

import Interfaces.Entity;

public class Campaign implements Entity{
	private int id;
	private String name;
	private int discountAmount;
	
	public Campaign() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Campaign(int id, String name, int discountAmount) {
		super();
		this.id = id;
		this.name = name;
		this.discountAmount = discountAmount;
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

	public int getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}
}
