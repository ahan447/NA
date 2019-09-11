package Na0904;

import java.util.Scanner;

public class N090401 {

	public static void main(String[] args) {
		// 점수를 입력받아서
		// 90-100 A
		// 80 89 B
		// 70 79 C
		// 60 69 D
		// 0 59 F
		// 0 100 사이가 아니면 잘못된 점수 입력

		Scanner sc = new Scanner(System.in);
		System.out.printf("점수를 입력하세요:");
		int score = sc.nextInt();

		// 조건넣
		if (score >= 90 && score <= 100) {
			System.out.printf("A\n");
		} else if (score >= 80 && score <= 89) {
			System.out.printf("B\n");
		} else if (score >= 70 && score <= 79) {
			System.out.printf("C\n");
		} else if (score >= 60 && score <= 69) {
			System.out.printf("D\n");
		} else if (score >= 0 && score <= 59) {
			System.out.printf("F\n");
		} else {
			System.out.printf("잘못된 점수를 입력하셨습니다.");
		}

		sc.close();
	}

}
