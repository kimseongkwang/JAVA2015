package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import control.CGangjwaControl;
import entity.CGangjwa;
import entity.CSugang;
import entity.VUser;
import exception.GangjwaIDMissMatchException;


public class CSugangView extends CView {

	public void sugangSincheong(VUser vUser) throws IOException {
		// TODO Auto-generated method stub
		//show Gangjwa List 강좌 리스트 가져오기
		CGangjwaControl gangjwaControl = (CGangjwaControl)this.getControl();
		Vector<CGangjwa> gangjwaList = gangjwaControl.getGangjwaList();
		for(CGangjwa gangjwa : gangjwaList ){
			System.out.println("강좌 ID: "+gangjwa.getID()+gangjwa.getName());
		}
		// 수강 신청 강좌 번호 입력
		System.out.println("강좌 ID 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String gangjwaID = scanner.next();
		//강좌 번호의 유효성 확인
		for(CGangjwa gangjwa : gangjwaList){
			if(gangjwa.getID().equals(gangjwaID)){
				CSugang sugang = new CSugang(vUser.getUserID(), gangjwa.getID());
				gangjwaControl.sugangSincheong(sugang);
				return;
			}
		}
		throw new GangjwaIDMissMatchException();
		//select Gangjwa
		//confirm sugangSincheong
		//show result
		
	}

}
