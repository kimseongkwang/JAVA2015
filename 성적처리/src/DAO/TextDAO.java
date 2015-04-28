package DAO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import entity.CEntity;

//import java.lang.reflect.Field;

public class TextDAO implements IDAO {
	private Scanner scanner;
	private BufferedWriter Writer;
	private String mode;
	
		@Override
		public void connect(String name, String mode) throws IOException {
			// TODO Auto-generated method stub
			this.mode = mode;
			if(this.mode.equals("r")){
				this.scanner = new Scanner(new File(name));
			}else if(this.mode.equals("w")){
				this.Writer = new BufferedWriter(new FileWriter(name, false));
			}else if(this.mode.equals("w+")){
				this.Writer = new BufferedWriter(new FileWriter(name, true));
			}
		}
		@Override
		public void disconnect() throws IOException {
			// TODO Auto-generated method stub
			if(this.mode.equals("r")){
			this.scanner.close();
			}else{
				this.Writer.close();
			}
		}
		public CEntity read(CEntity	entity, String ID) {
			while(scanner.hasNext()){
				entity.read(scanner);
				if(entity.getID().equals(ID))
					return entity;
				}
				return null;
		}
		public void write(CEntity entity) {
			entity.write(Writer);
			
		}
		@Override
		public CEntity readNext(CEntity entity) {
				entity.read(scanner);
				return entity;
				
		}
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return scanner.hasNext();
		}
}
