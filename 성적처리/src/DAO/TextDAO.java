package DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import entity.CEntity;

//import java.lang.reflect.Field;

public class TextDAO implements IDAO {

	
	public Object read(Class clazz, String filename) {
	
		try {
			Scanner scanner = new Scanner(new File(filename));
			CEntity entity = (CEntity) clazz.newInstance();
			entity.read(scanner);
			return entity;
		}catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	public void write(Object object, String filename) {
	
		//Field[] fields = object.getClass().getDeclaredFields();
		
	}

}
