package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.grade.config.DBContract;
import com.biz.grade.config.Lines;
import com.biz.grade.domain.StudentVO;

public class StudentServiceImplV1 implements StudentService{
	
	private List<StudentVO> studentList;
	private Scanner scan;
	private String fileName ;

	public StudentServiceImplV1() {
		studentList = new ArrayList<StudentVO>();
		scan = new Scanner(System.in);
		fileName = "src/com/biz/grade/exec/data/student.txt";
	}
	@Override
	public void loadStudent() {
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
				
				String[] students = reader.split(":");
				StudentVO studentVO = new StudentVO();
				studentVO.setNum( students [DBContract.STUDENT.ST_NUM]);
				studentVO.setName( students [DBContract.STUDENT.ST_NAME]);
				studentVO.setDept( students [DBContract.STUDENT.ST_DEPT]);
				studentVO.setGrade( Integer.valueOf(students [DBContract.STUDENT.ST_GRADE]));
				studentVO.setTel( students [DBContract.STUDENT.ST_TEL]);
				studentList.add(studentVO);
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
	public boolean inputStudent() {
		StudentVO studentVO = new StudentVO();
		System.out.println("학번(END:종료)>>");
		// 변수명 명명 규칙
		// Camel case : 두 단어 이상 사용 할 때 단어 첫글자 대문자
		// snake case : 두 단어 이상 사용 할 때 단어 사이 _(under_score)
		String st_num = scan.nextLine();
		if(st_num.equals("END")) {
			return false;
		}
		int intNum = 0;
		try {
			intNum = Integer.valueOf(st_num);
		} catch(Exception e) {
			System.out.println("학번은숫자");
			System.out.println("입력한문자열"+st_num);
			return true;
			
		}
		if(intNum < 1 || intNum > 99999) {
			System.out.println("학번은 1부터 99999까지");
			System.out.println("다시");
			return true;
		}
		//00001형식으로 만들기
		st_num = String.format("%05d",intNum);
		studentVO.setNum(st_num);
		
		System.out.print("이름(END:종료)>>");
		String st_name = scan.nextLine();
		if(st_name.equals("END")) {
			return false;
		}
		studentVO.setName(st_name);
		
		System.out.print("학과(END:종료)>>");
		String st_dept = scan.nextLine();
		if(st_dept.equals("END")) {
			return false;
		}
		studentVO.setDept(st_dept);
		
		
		System.out.print("학년(END:종료)>>");
		// 변수명 명명 규칙
		// Camel case : 두 단어 이상 사용 할 때 단어 첫글자 대문자
		// snake case : 두 단어 이상 사용 할 때 단어 사이 _(under_score)
		String st_grade = scan.nextLine();
		if(st_grade.equals("END")) {
			return false;
		}
		int intGrade = 0;
		try {
			intGrade = Integer.valueOf(st_grade);
		} catch(Exception e) {
			System.out.println("학년은숫자");
			System.out.println("입력한문자열"+st_num);
			return true;
			
		}
		if(intNum < 1 || intNum > 4) {
			System.out.println("학년은 1부터 4까지");
			System.out.println("다시");
			return true;
		}
		//00001형식으로 만들기
		st_num = String.format("%05d",intNum);
		studentVO.setNum(st_num);
		
	
		System.out.print("전화번호 (END:종료)>>");
		// 변수명 명명 규칙
		// Camel case : 두 단어 이상 사용 할 때 단어 첫글자 대문자
		// snake case : 두 단어 이상 사용 할 때 단어 사이 _(under_score)
		String st_tel = scan.nextLine();
		if(st_tel.equals("END")) {
			return false;
		}
		studentVO.setTel(st_tel);
		int intTel = 0;
		try {
			intTel = Integer.valueOf(st_num);
		} catch(Exception e) {
			System.out.println("학번은숫자");
			System.out.println("입력한문자열"+st_num);
			return true;
			
			
		}
		studentVO.setTel(st_tel);
		
		this.
		if(intNum < 1 || intNum > 99999) {
			System.out.println("학번은 1부터 99999까지");
			System.out.println("다시");
			return true;
		}
		//00001형식으로 만들기
		st_num = String.format("%05d",intNum);
		studentVO.setNum(st_num);
		
		
		
		
		
		return true;
		
	}

	@Override
	public void saveStudent() {

		FileWriter fileWriter = null;
		PrintWriter pWriter = null;
		
		try {
			fileWriter = new FileWriter(this.fileName);
			pWriter = new PrintWriter(fileWriter);
			
			// 내부의 Writer buffer에 값을 기록
			for(StudentVO sVO : studentList) {
				pWriter.printf("%s:",sVO.getNum());
				pWriter.printf("%s:",sVO.getName());
				pWriter.printf("%s:",sVO.getDept());
				pWriter.printf("%d:",sVO.getGrade());
				pWriter.printf("%s\n:",sVO.getTel());
			}
			// Writer buffer에 기록된 값을 파일에 저장
			pWriter.flush();
			pWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void studentList() {
		// TODO Auto-generated method stub
		System.out.println(Lines.dLine);
		System.out.println("학생명부리스트");
		System.out.println(Lines.dLine);
		System.out.println("학번\t|이름\t|학과\t|학년\t|전화번호\t|");
		System.out.println(Lines.dLine);
		for(StudentVO sVO : studentList) {
			System.out.printf("%s\t|", sVO.getNum());
			System.out.printf("%s\t|", sVO.getName());
			System.out.printf("%s\t|", sVO.getDept());
			System.out.printf("%s\t|", sVO.getGrade());
			System.out.printf("%s\t|\n", sVO.getTel());
			
		}
		System.out.println(Lines.dLine);
	}

}
