package org.uptake.exercise.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="person")
public class Person {

	private Long id;
	private String firstName;
	private String lastName;
	private Double money;
	private int familyId;
	private String isFamily;
	
	public String getIsFamily() {
		return isFamily;
	}
	public void setIsFamily(String isFamily) {
		this.isFamily = isFamily;
	}
	public int getFamilyId() {
		return familyId;
	}
	public void setFamilyId(int familyId) {
		this.familyId = familyId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	
	
}
