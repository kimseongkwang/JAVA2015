package DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

import entity.CEntity;

//import java.lang.reflect.Field;

public class TextDAO implements IDAO {
	private Scanner scanner;
	
	public CEntity read(CEntity	entity, String ID) {
		while(scanner.hasNext()){
		entity.read(scanner);
		if(entity.getID().equals(ID))
			return entity;
		}
		return null;
	}
	public void write(CEntity entity) {
		entity.write(scanner);
		
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
	@Override
	public Vector<CEntity> readAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
