package DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import entity.CEntity;

//import java.lang.reflect.Field;

public class TextDAO implements IDAO {
	private Scanner scanner;
	
	public CEntity read() {
	
		CEntity entity = new CEntity();
		entity.read(scanner);
		return entity;
	
	}

	
	public void write(CEntity entity) {
	
		//Field[] fields = object.getClass().getDeclaredFields();
		
	}


	@Override
	public void connect(String name) throws FileNotFoundException {
		// TODO Auto-generated method stub
		this.scanner = new Scanner(new File(name));
	}


	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		this.scanner.close();
		
	}

}
