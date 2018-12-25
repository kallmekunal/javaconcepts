package com.kunal.practice.serialization.serializationproxy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fStream = new FileOutputStream(new File("fileOut.ser"));
		ObjectOutputStream oos = new ObjectOutputStream(fStream);
		FileInputStream fiStream = new FileInputStream(new File("fileOut.ser"));
		ObjectInputStream ios = new ObjectInputStream(fiStream);
		try {
			SerializedPojo pojo = new SerializedPojo(10, "Kunal");
			oos.writeObject(pojo);
			SerializedPojo readPojo = (SerializedPojo) ios.readObject();
			System.out.println(readPojo.getI());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			oos.close();
			fStream.close();
			ios.close();
		}
	}

}
