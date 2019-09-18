package util;

import java.util.Date;
import java.util.GregorianCalendar;

public class DateMain {

	public static void main(String[] args) {
		//1986년 5월 5일을 Date 객체로 만들기
		
		
		//바로 객체를 생성하면 Deprecated 메시지 - 경고가 발
		Date date = new Date(86, 4, 5);
		System.out.printf("%s\n", date);
		
		//GregorianCalendar를 이용해서 객체를 생성하고
		//이 정보를 가지고 date 객체를 만들어서 사용
		//월 정보는 0부터 시작하기 때문에 -1 적용을 해서 작성
		
		GregorianCalendar cal = 
				new GregorianCalendar(1986, 4 , 5);
		date = new Date(cal.getTimeInMillis());
		System.out.printf("%s\n", date);
		
		//java.sql.Date 사용
		//서로 다른 패키지에 있는 동일한 클래스를 같이 사용할 떄는
		//나중에 사용되는 클래스에 패키지 이름을 붙여서 작성
		java.sql.Date d = 
				new java.sql.Date(
						cal.getTimeInMillis());
		System.out.printf("%s\n", d);
	}

}
