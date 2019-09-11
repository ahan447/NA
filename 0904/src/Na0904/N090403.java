package Na0904;

import java.util.Scanner;

public class N090403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
		
	//입력
	
			
			System.out.printf("메뉴 선택(1.중국집 , 2.분식집, 3.한식집):");
			String m1 = sc.nextLine();
	
			final String 중식 = "1";
			final String 분식 = "2";
			final String 한식 = "3";
			
			
			
	
			
			//	조건 처리 switch
			
			switch(m1) {
			case 중식 :
				System.out.printf("중국집\n");
				break;
			case 분식 :
				System.out.printf("분식집\n");
				break;
			case 한식 :
				System.out.printf("한식집\n");
				break;
			default :
				System.out.printf("잘못된 선택\n");
				break;
				
			}
	
	
	
	
		
		
	
	
	sc.close();
		
	}

}
