package com.kunal.practice.serialization.externalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableApp {

	public static void main(String[] args) {

		ExternalizedStudent student = new ExternalizedStudent(4,"kunal");
		 //Serialize
		  try
		  {
		   FileOutputStream fileOut = new FileOutputStream("student.ser");
		   ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
		   outStream.writeObject(student);
		   outStream.close();
		   fileOut.close();
		  }catch(IOException i)
		  {
		   i.printStackTrace();
		  }
		 
		  //Deserialize
		  student = null;
		  try
		  {
		   FileInputStream fileIn =new FileInputStream("student.ser");
		   ObjectInputStream in = new ObjectInputStream(fileIn);
		   student = (ExternalizedStudent) in.readObject();
		   in.close();
		   fileIn.close();
		  }catch(IOException i)
		  {
		   i.printStackTrace();
		   return;
		  }catch(ClassNotFoundException c)
		  {
		   System.out.println("student class not found");
		   c.printStackTrace();
		   return;
		  }
		  System.out.println("Deserialized student...");
		  System.out.println("Name: " + student.getName());
		  System.out.println("roll: " + student.getRoll());
		 
	}

}
