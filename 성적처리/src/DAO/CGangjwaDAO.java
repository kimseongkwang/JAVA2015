package DAO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import entity.CGangjwa;

public class CGangjwaDAO {
		
	public CGangjwa read(){return null;}
	public void write(CGangjwa gangjwa) {
	// TODO Auto-generated method stub
		System.out.println("����ID: "+gangjwa.getID());
		System.out.println(",�����: "+gangjwa.getName());
		
		//serialize
		try {
			ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream("gangjwa"));
			out.writeObject(gangjwa);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}