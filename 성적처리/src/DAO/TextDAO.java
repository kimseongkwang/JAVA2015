package DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import entity.CEntity;

//import java.lang.reflect.Field;

public class TextDAO implements IDAO {

	
	public CEntity read(CEntity entity, String filename) {
	
		try {
			Scanner scanner = new Scanner(new File(filename));
			entity.read(scanner);
			return entity;
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	public void write(Object object, String filename) {
	
		//Field[] fields = object.getClass().getDeclaredFields();
		
	}

}
