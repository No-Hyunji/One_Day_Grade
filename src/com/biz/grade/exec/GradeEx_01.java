package com.biz.grade.exec;

import java.util.Scanner;

import com.biz.grade.config.Lines;
import com.biz.grade.service.StudentService;
import com.biz.grade.service.StudentServiceImplV1;

public class GradeEx_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StudentService stService = new StudentServiceImplV1();
		stService.loadStudent();

		while (true) {
			System.out.println(Lines.dLine);
			System.out.println("빛고을 대학학사관리시스템 V1");
			System.out.println(Lines.dLine);
			System.out.println("1. 학생정보 등록");
			System.out.println("2. 학생정보 출력");
			System.out.println("QUIT. 업무종료");
			System.out.println(Lines.dLine);
			System.out.println("업무선택>>");

			String stMenu = scan.nextLine();
			if (stMenu.equals("QUIT")) {
				break;
			}
			int intMenu = 0;
			try {
				intMenu = Integer.valueOf(stMenu);
			} catch (Exception e) {
				System.out.println("메뉴는숫자로만선택");
				continue;
			}
			if (intMenu == 1) {
				while(true) {
					if(!stService.inputStudent()) {
						break;
					};
					
				}
			} else if (intMenu == 2) {
				stService.studentList();
			}
		}
		System.out.println("업무종료");
		System.out.println("퇴근이다~!");
	}

}
