package com.kunal.serialization.nonserializablesuper;

import java.io.Serializable;

public class Base {
	
	int i;
	/*
	 * Without this default constructor it will throw invalidclass exception as it can 
	 * deserialization can not instantiate the default value of j
	 */ 
	Base()
	{
		System.out.println("Default value of base");
		i = 10;
	}

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
