package com.kunal.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Driver {

	public static void main(String[] args) {
		try {
			//Writing object to outputstream with help of object output stream
			FileOutputStream fo = new FileOutputStream(new File("serializedStudent"));
			SerializedStudent student = new SerializedStudent(25, "KuchBhi");
			ObjectOutputStream ostream = new ObjectOutputStream(fo);
			ostream.writeObject(student);


			FileInputStream iStream = new FileInputStream(new File("serializedStudent"));
			ObjectInputStream iObjStream = new ObjectInputStream(iStream);
			SerializedStudent readStudent  = (SerializedStudent)iObjStream.readObject();
			System.out.println(readStudent.getName());
			System.out.println(readStudent.getRoll());
			System.out.println(readStudent.getPass());
			
		} catch ( IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
