package com.biz.grade.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.biz.grade.vo.StudentVO;

public class StudentServiceImplV1 implements StudentService{
	
	protected ArrayList<StudentVO> studentList;

	public StudentServiceImplV1() {
		studentList = new ArrayList<StudentVO>();
	}

	@Override
	public boolean inputStudent() {
		// TODO Auto-generated method stub
		StudentVO stdVO = new StudentVO();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학번>>");
		String strNum = scan.nextLine();
		stdVO.setNum(strNum);
		
		System.out.print("이름>>");
		String strName = scan.nextLine();
		stdVO.setName(strName);
		
		System.out.print("학과>>");
		String strDept = scan.nextLine();
		stdVO.setDept(strDept);
		
		System.out.print("학년>>");
		String strGrade = scan.nextLine();
		stdVO.setName(strGrade);
		
		int intGrade = 0;
		try {
			intGrade = Integer.valueOf(strGrade);
		} catch (Exception e) {
			System.out.println("학년은 숫자로만 입력");
			System.out.println(stdVO.getName() + "다시 입력해 주세요");
			return true;
		}
		if(intGrade < 1 || intGrade > 4) {
			System.out.println("학년은 1 ~ 4까지만 가능");
			System.out.println(stdVO.getName() + "다시 입력해 주세요");
			return true;
		}
		
		System.out.print("전화번호>>");
		String strPhone = scan.nextLine();
		stdVO.setPhone(strPhone);
		
		
		stdVO.setGrade(intGrade);
		
		studentList.add(stdVO);

		return true;
	
	}

	@Override
	public void studentList() {
		// TODO Auto-generated method stub
		
		System.out.println("===================================================================");

		System.out.println("학번\t이름\t학과\t학년\t전번\n");

		System.out.println("-------------------------------------------------------------------");

		for(StudentVO student: studentList) {

			System.out.printf("%s\t%s\t%s\t%s\t%s\n"
					, student.getNum()
					, student.getName()
					, student.getDept()
					, student.getGrade()
					, student.getPhone());

		}

		

		System.out.println("===================================================================");

 

	}
		
	}
	
	

