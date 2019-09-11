package Na0904;

import java.util.Scanner;

public class N090402 {

	public static void main(String[] args) {
		// 입력 부분
		Scanner sc = new Scanner(System.in);
		System.out.printf("아이디를 입력하세요:");
		String ID = sc.nextLine();
		
		System.out.printf("비밀번호를 입력하세요:");
		String PW = sc.nextLine();
		
		//조건 부분
		if(ID.equals("root") && PW.equals("1234")) {
			System.out.printf("로그인에 성공하였습니다.\n");
		}else if(ID.contentEquals("root")) {
			System.out.printf("비밀번호가 틀렸습니다.");
		}else {System.out.printf("없는 아아디입니다.");
			
			}
		
		
		
		
		
		
		
		
		
		
		
		

sc.close();
	}

}
