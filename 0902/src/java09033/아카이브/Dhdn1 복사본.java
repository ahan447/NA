package NA.java0903;

public class Dhdn1 {

	public static void main(String[] args) {
		// <, >, <=, >=,==,!= 은 연산의 결과가 boolean
		System.out.println("10 > 3:" + (10>3));
		//실수 연산의 결과 비교는 주의
		System.out.println( "(1-0.8)==0.2:" + ((1-0.8)==0.2));
		System.out.println("12 >= 12:" + (12>=12));
		int x = 10;
		//x가 4,5의 배수인지 확인
		boolean resilt = x % 5 == 0 || x % 5 == 0;
		System.out.println("resilt:" + resilt);
		
	
		//year에는 년도가 저장
		int year = 2019;
		//4의 배수이고 100의 배수가 아닌 경우 또는 	400의 배수인 경우 윤년
		resilt = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		System.out.println(year + ":" + (resilt ? "윤년O":"윤년X"));
	
		
		

		//1부터 100까지 3의 배수이고 4의 배수인 데이터의 갯수를 파악
		// && 나 || 는 좌우식의 위치를 변경해도 결과는 동일
		int cnt = 0;
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0 && i % 4 == 0)
			{ cnt = cnt +1;
			
			}}
		
		cnt = 0;
		for(int i=1; i<=100; i++) 
			if(i % 4 == 0 && i % 3 == 0)
			 cnt = cnt +1;
		int k = 10;
		//앞의 결과가 false 여서 뒤의 데이터를 확인하지 않음
		//k의 값은 그대로 10
		resilt = k < 5 &&(k++ >6) ;
		System.out.printf("k:%d\n" ,  k);
		
			
		{{
			int n1 = 20;
		int n2 = 30;
		
		int min = n1 < n2 ? n1 : n2;
				System.out.printf("작은 값:%d\n" , min); 
			}}
		
		int time =7700;
		//time에 전체 시간이 초단위로 저장되어 있음.
		//time은 몇시간 몇분 몇초인지 계산
		//2시간 8분 20초
		
		int a1 = (time / 3600);
		int a2 = (time - a1*3600) / 60;
		int a3 = time %60;
		//% 왼쪽에서 오른쪽의값의 배수만큼 빼고 나머지를 표기
		
		System.out.println( a1 + "시간" + a2 + "분" + a3 + "초");
		System.out.println(time % 6);
		
		
		int money = 770000;
		//5만원권 1만원권갯수 제일 적은 지폐수로
		
		
		int b1 = (money / 50000);
		int b2 = ((money %50000)/10000);
		int b3 = (money / 10000);
		
				System.out.printf("5만원 %d장 1만원 %d장\n" + b3 +"만원", b1 ,b2);
	}}
				
		
		
		
		
	



