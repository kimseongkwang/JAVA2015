package view;

import java.util.Vector;

import control.CSugangControl;
import entity.CGangjwa;
import entity.VUser;


public class CSugangView extends CView {

	public void sugangSincheong(VUser vUser) {
		// TODO Auto-generated method stub
		//show Gangjwa List
		CSugangControl sugangControl = (CSugangControl)this.getControl();
		Vector<CGangjwa> gangjwaList = sugangControl.getGangjwaList();
		//select Gangjwa
		//confirm sugangSincheong
		//show result
		
	}

}
