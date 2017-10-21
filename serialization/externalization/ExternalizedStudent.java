package com.kunal.serialization.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class ExternalizedStudent implements Externalizable {

	
	/**
	 * For versioning of class.
	 */
	private static final long serialVersionUID = 1L;
	
	public ExternalizedStudent(int aRoll,String aName) {
		this.roll = aRoll;
		this.name = aName;
	}
	
	public ExternalizedStudent(){
		
	}
	
	int roll;
	String name;
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
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeInt(roll);
		out.writeObject(name);
		
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		roll = in.readInt();
		name = (String)in.readObject();
	}
}
