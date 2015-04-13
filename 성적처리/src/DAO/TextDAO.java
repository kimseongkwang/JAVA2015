package DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import entity.CEntity;

//import java.lang.reflect.Field;

public class TextDAO implements IDAO {
	private Scanner scanner;
	
	public CEntity read(CEntity	entity) {
		entity.read(scanner);
		return entity;
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
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return this.scanner.hasNext();
	}
}
