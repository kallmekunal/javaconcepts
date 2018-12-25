package com.kunal.practice.serialization.nonserializablesuper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerializedSuperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Derived derived = new Derived(100);
		ObjectOutputStream oos = null;
		ObjectInputStream ois= null;
		
		try 
		{
		//Writing
		FileOutputStream fos = new FileOutputStream("supernonserialized.ser");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(derived);
		oos.close();
		//Reading
		FileInputStream fis = new FileInputStream("supernonserialized.ser");
		ois = new ObjectInputStream(fis);
		Derived readObject = (Derived)ois.readObject();
		
		ois.close();
		System.out.println("I Val "+ readObject.getI());
		System.out.println("J Val "+ readObject.getJ());
		
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}		
	}

}
