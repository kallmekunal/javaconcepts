package com.kunal.serialization;

import java.io.Serializable;

public class SerializedStudent implements Serializable {

	
	/**
	 * For versioning of class.
	 */
	private static final long serialVersionUID = 1L;
	
	public SerializedStudent(int aRoll,String aName) {
		// TODO Auto-generated constructor stub
		this.roll = aRoll;
		this.name = aName;
	}
	
	int roll;
	String name;
	String pass;
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
