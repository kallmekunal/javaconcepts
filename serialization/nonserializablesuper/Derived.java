package com.kunal.practice.serialization.nonserializablesuper;

import java.io.Serializable;

public class Derived extends Base implements Serializable{

	int j;
	
	
	public int getJ() {
		return j;
	}


	public void setJ(int j) {
		this.j = j;
	}


	Derived(int aJ){
		super(5);
		this.j = aJ;
	}
}
