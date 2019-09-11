package NA.java0903;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//년도를 입력받아서 윤년이면 2월은 29이라고 출력하고
		// 윤년이 아니면 2월은 28일 이라고 출력
		// 윤년의 조건
		// 1.4의 배수이고 100의 배수는 아닌 경우 또는
		// 2.400의 배수인 경우
		System.out.println("년도를 입력하세요:");
		int n1 = sc.nextInt();
		if (n1 % 4 == 0 && n1 % 100 != 0 || n1 % 400 == 0) {
			System.out.printf("2월은 29일로 윤년입니다.");

		} else {
			System.out.printf("2월은 28일로 윤년이 아닙니다.");
		}

		sc.close();

	}

}
