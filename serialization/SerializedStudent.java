package com.kunal.practice.serialization;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.NotActiveException;
import java.io.ObjectInputValidation;
import java.io.Serializable;

public class SerializedStudent implements Serializable ,ObjectInputValidation{


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

	//Below is the customization part of serialization

	public Object readResolve() {
		System.out.println("ReadResolve");
		return new SerializedStudent(25, "Kunal");
	}

	public Object writeReplace() {
		System.out.println("writeReplace" + this.toString());
		return new SerializedStudent(0, "Karan");
	}

	private void readObject(java.io.ObjectInputStream in) throws ClassNotFoundException, IOException {
		System.out.println("readObject");
		in.registerValidation(this, 0);
		in.defaultReadObject();

	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		System.out.println("writeObject"+ this.toString());
		out.defaultWriteObject();
	}

	//Below method is coming from ObjectInputValidation interface.
	@Override
	public void validateObject() throws InvalidObjectException {
		System.out.println("validateObject");
		System.out.println(this.toString());
	}
	
	public String toString() {
		return "Name "+ name +" roll "+ roll;
	}
}
