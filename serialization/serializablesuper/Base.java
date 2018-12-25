package com.kunal.practice.serialization.serializablesuper;

import java.io.Serializable;

public class Base implements Serializable {
	
	int i;

	Base(int aI){
		this.i = aI;
	}
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	

}
