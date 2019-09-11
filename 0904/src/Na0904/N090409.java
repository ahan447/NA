package Na0904;

import java.util.Scanner;

public class N090409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
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
