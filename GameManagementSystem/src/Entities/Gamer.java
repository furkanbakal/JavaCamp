package Entities;

import Interfaces.Entity;

public class Gamer implements Entity{
	private String firstName;
	private String lastName;
	private String entitiyId;
	private int birthOfDate;
	
	public Gamer() {
	
	}

	public Gamer(String firstName, String lastName, String entitiyId, int birthOfDate) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.entitiyId = entitiyId;
		this.birthOfDate = birthOfDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEntitiyId() {
		return entitiyId;
	}

	public void setEntitiyId(String entitiyId) {
		this.entitiyId = entitiyId;
	}

	public int getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(int birthOfDate) {
		this.birthOfDate = birthOfDate;
	}
}
