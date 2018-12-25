package com.kunal.practice.serialization.serializationproxy;

public class SimpleNonSerializedPojo {
	
	int i;
	String str;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public SimpleNonSerializedPojo(int i, String str) {
		super();
		this.i = i;
		this.str = str;
	}
}
