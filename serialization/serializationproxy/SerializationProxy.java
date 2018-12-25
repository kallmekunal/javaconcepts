package com.kunal.practice.serialization.serializationproxy;

import java.io.Serializable;

public class SerializationProxy implements Serializable{
	int i;
	String str;
	
	public SerializationProxy(SerializedPojo pojo) {
		this.i = pojo.getI();
		this.str = pojo.getStr();
	}
	
	private Object readResolve() {
		 return new SerializedPojo(i,str);
	}
}
