package com.biz.grade.exec;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Date;


public class PrintStreamEx_2 {
	
	public static void main(String[] args) {
		
		String fileName = "src/main/com/biz/grade/exec/data/test1/txt";
		FileWriter filwWriter = null;
		PrintWriter pWriter = null;
		
		try {
			/* Print writer는 보통 단독으로 사용하지 않고 FileWriter로 반드시 파일 오픈한후 프린트라이터에 연결하여사용한다.
			fileWriter = new FileWriter(fileName)
			/* PrintStream()으로 파일을 기록하기 위해 오픈
			 * 기존파일이 삭제되고 새로 생성*/
			pWriter = new PrintWriter(fileName);
			
			Date date = new Date();
			
			FileWriter = new FileWriter(fileName, true);
			pWriter.println("대한민국만세" + date.toString());
			
			/* printWriter는 값을 저장하면 일단 임시 buffer에 보관이 된다 flush() method를 호출하여 buffer에 담긴 데이터를 파일로 보낸 후 close() 해주어야 한다.*/
			pWriter.flush();
			pWriter.close();			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
