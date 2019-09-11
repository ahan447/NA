package java0903;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		// 아이디와 비밀번호를 입력받는문장
		Scanner sc = new Scanner(System.in);
		//아아디 랑 비밀번호 입력받기
		System.out.printf("아이디를 입력하세요:");
		String id = sc.nextLine();
		System.out.printf("비밀번호를 입력하세요:");
		String pw = sc.nextLine();
		//id가 root이고 pw가 1234이면 로그인 성공 이라고 출력하고
		//그렇지 않으면 로그인 실패라고 출력하기
		if(id.equals("root") && pw.equals("1234")) {
			System.out.printf("로그인 성공\n");
			
			
	 }else
		{System.out.printf("로그인 실패\n");
		
			
			
		}
		
		
		
		
		
		
		
		sc.close();
		
	}

}
