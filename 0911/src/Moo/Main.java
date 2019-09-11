package Moo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int port = 8899;	
		int  a = 10;
			int b = 0;
			System.out.printf("a:%d \t b:%d\n", a,b);
			try {
				//여기서 문제가 발생하더라도 어래 문장들을 계속처리
			System.out.printf("a/b\n", a/b);
			if(port == 8899)
				throw new ArithmeticException();
			}catch(Exception e){
				System.out.printf("계산하는 도중 문제발생\n");
				//프로그램 종료
				System.exit(0);
			}
			System.out.printf("예외 처리의 목적에 대해서 알아봅니다.\n");
			
			
	}

}
