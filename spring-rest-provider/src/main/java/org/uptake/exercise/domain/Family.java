package org.uptake.exercise.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="family")
public class Family extends Person{
	
	private String familyRelation;
	
	public String getFamilyRelation() {
		return familyRelation;
	}
	public void setFamilyRelation(String familyRelation) {
		this.familyRelation = familyRelation;
	}
	

}
