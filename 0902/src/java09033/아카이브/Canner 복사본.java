package NA.java0903;

import java.util.Scanner;

public class Canner {

	public static void main(String[] args) {
		// 키보드로부터 입력받을 수 있는 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 이름을 문자열로 입력받기
		System.out.println("이름을 입력하세요:");
		String name = sc.nextLine();
		System.out.printf("이름:%s\n", name);

		System.out.println("나이를 입력하세요:");
		int age = sc.nextInt();
		System.out.printf("나이:%s\n", age);

		System.out.println("점수를 입력하세요");

		// 정수를 받아 스코어에 저장
		int score = sc.nextInt();

		// 스코어가 60이상이면 합격이라고 출력
		if (score >= 60) {
			System.out.printf("합격\n");
		} else {
			System.out.printf("불합격\n");
		}

		sc.close();
	}

}
