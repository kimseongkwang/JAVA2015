package DAO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class DAO {
	
	public Object read(String filename){
		
		Object object = null;
		try {
			ObjectInputStream in;
			in = new ObjectInputStream(new FileInputStream(filename));
			object = in.readObject();
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public void write(Object object, String filename) {
	// TODO Auto-generated method stub
		
		//serialize
		try {
			ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream(filename));
			out.writeObject(object);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
