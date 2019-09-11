package Na0904;

import java.util.Scanner;

public class N090408 {

	public static void main(String[] args) {
		// 1,2,3 이외의 문자열을 입력하면 다시 입력하도록 하고
		// 1,2,3 을 입력하면 정상 입력이라고 출력하고 종료
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.printf("메뉴를 입력하세요:");
		String M = sc.nextLine();
		if(!M.equals("1") && !M.equals("2") && !M.equals("3") ) {
			System.out.printf("메뉴는 1 또는 2또는 3으로 입력하세요\n");
			}else {
				System.out.printf("정상입력\n");
				break;
			}
	}
		
		
		
		//scanner는 닫히면 다시 사용할수 없고 새로 만들어야 함.
		//0부터 100까지의 정수를 입력할때까지 입력받기
		
		while(true) {
			System.out.printf("점수를 입력하세요:");
			int S = sc.nextInt();
			if(S >= 101 || S <= 0) {
				System.out.printf("잘못된 점수입니다. 다시 입력해주세요.\n");
			} else {
				System.out.printf("OK확인\n");
			break;
			}
		}
		
		sc.close();

}

}
