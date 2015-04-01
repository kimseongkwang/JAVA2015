package DAO;

public class TextDAO implements IDAO {

	@Override
	public Object read(String filename) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void write(Object object, String filename) {
		// TODO Auto-generated method stub
		Field[] fields = object.getClass().getDeclaredFields();
		
	}

}
