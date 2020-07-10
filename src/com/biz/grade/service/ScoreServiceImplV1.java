package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.grade.config.DBContract;
import com.biz.grade.config.Lines;
import com.biz.grade.domain.ScoreVO;
import com.biz.grade.domain.StudentVO;

public class ScoreServiceImplV1 implements ScoreService{
	
	private List<ScoreVO> scoreList;
	private Scanner scan;
	private String fileName;
	
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		fileName = "src/com/biz/grade/exec/data/score.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(this.fileName);
			buffer = new BufferedReader(fileReader);
			String reader = "";
			while(true) {
				reader = buffer.readLine();
				if(reader ==null) {
					break;
				}
				
				String[] scores = reader.split(":");
				ScoreVO scoreVO = new ScoreVO();
				scoreVO.setNum( scores [DBContract.STUDENT.SC_NUM]);
				scoreVO.setKor( Integer.valueOf(scores [DBContract.STUDENT.SC_KOR]));
				scoreVO.setEng( Integer.valueOf(scores [DBContract.STUDENT.SC_ENG]));
				scoreVO.setMath(Integer.valueOf(scores [DBContract.STUDENT.SC_MATH]));
				scoreVO.setMusic( Integer.valueOf(scores [DBContract.STUDENT.SC_MUSIC]));
				scoreList.add(scoreVO);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("학생정보파일열기오류");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("학생정보파일읽기오류");
		}
	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean inputScore() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		FileWriter fileWriter = null;
		PrintWriter pWriter = null;
		try {
			fileWriter = new FileWriter(this.fileName);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void scoreList() {
		System.out.println(Lines.dLine);
		System.out.println("성적");
		System.out.println(Lines.dLine);
		System.out.println("학번\t|이름\t|국어\t|영어\t|수학\t|음악\\t|총점\\t|");
		System.out.println(Lines.dLine);
		for(ScoreVO sVO : scoreList) {
			System.out.printf("%s\t|", "이름");
			System.out.printf("%d\t|", sVO.getNum());
			System.out.printf("%s\t|", sVO.getDept());
			System.out.printf("%s\t|", sVO.getGrade());
			System.out.printf("%s\t|\n", sVO.getTel());
			
		}
		System.out.println(Lines.dLine);
	}
	}

}
