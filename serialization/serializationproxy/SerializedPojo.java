package com.kunal.practice.serialization.serializationproxy;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class SerializedPojo extends SimpleNonSerializedPojo implements Serializable {

	public SerializedPojo(int i, String str) {
		super(i, str);
	}

	private Object writeReplace() {
		return new SerializationProxy(this);
		}
	
	//This for any malicious attempt to avoid serialization of POJO without Proxy introduced
	private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use Serialization Proxy instead.");
    }
}
