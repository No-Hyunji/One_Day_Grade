package com.biz.grade.config;

public class DBContract {
	
	// 학번, 이름, 학과, 학년, 전화번호
	public static class STUDENT {
		public static final int ST_NUM = 0;
		public static final int ST_NAME = 0;
		public static final int ST_DEPT = 0;
		public static final int ST_GRADE = 0;
		public static final int ST_TEL = 0;
	}
	
	// 학번, 국어, 영어, 수학, 음악, 총점, 평균
	public static class SCORE {
		public static final int SC_NUM = 0;
		public static final int SC_KOR = 1;
		public static final int SC_ENG = 2;
		public static final int SC_MATH = 3;
		public static final int SC_MUSIC = 4;
		public static final int SC_SUM = 5;
		public static final int SC_AVG = 6;
	}

}
