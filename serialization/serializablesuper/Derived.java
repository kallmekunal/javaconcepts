package com.kunal.serialization.serializablesuper;

public class Derived extends Base {

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
