package entity;

import java.io.BufferedWriter;
import java.util.Scanner;

public class CGangjwa extends CEntity {
	private String name;
	private int gwamokID;

	public String getName() {	return name;}
	public void setName(String name) {this.name = name;}
	public int getGwanmokID() {return gwamokID;}
	public void setGwanmokID(int gwanmokID) {this.gwamokID = gwanmokID;}

	@Override
	public void read(Scanner scanner) {
		// TODO Auto-generated method stub
		ID = scanner.next();
		name = scanner.next();

	}

	@Override
	public void write(BufferedWriter scanner) {
		// TODO Auto-generated method stub

	}

}
