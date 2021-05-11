package Entities;

import Interfaces.Entity;

public class Selling implements Entity{
	private int id;
	private double price;
	private int piece;
	
	public Selling() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Selling(int id, double price, int piece) {
		super();
		this.id = id;
		this.price = price;
		this.piece = piece;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPiece() {
		return piece;
	}

	public void setPiece(int piece) {
		this.piece = piece;
	}

	
}
