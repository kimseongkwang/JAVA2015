package control;

import java.io.FileNotFoundException;
import java.util.Vector;

import entity.CGangjwa;
import entity.CSugang;

public class CGangjwaControl extends CControl{

	public Vector<CGangjwa> getGangjwaList() throws FileNotFoundException {
		// TODO Auto-generated method stub
		//real entity list
		Vector<CGangjwa> gangjwaList = new Vector<CGangjwa>();
		this.getDao().connect("gangjwa.txt");
		while(this.getDao().hasNext()){
			CGangjwa gangjwa = new CGangjwa();
			gangjwa = (CGangjwa)this.getDao().readNext(gangjwa);
			gangjwaList.add(gangjwa);
		}
		this.getDao().disconnect();
		return gangjwaList;
	}

	public void sugangSincheong(CSugang sugang) {
		// TODO Auto-generated method stub
		
	}

}
