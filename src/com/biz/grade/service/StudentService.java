package com.biz.grade.service;
/*
 * 파일을 읽어서 List에 담기
 * 학생 정보를 입력받아 List에 담기
 * List에 담긴 학생정보를 파일에 저장하기
 */
public interface StudentService {
	
	public void loadStudent();
	public boolean inputStudent();
	public void saveStudent();
	public void studentList();

}
