package Na0904;

import java.util.Scanner;

public class N090410 {

	public static void main(String[] args) {
		// on , off를 교대로 10번 출
		for (int A = 0; A < 3; A = A + 1) {
			if (A % 2 == 0) {
				System.out.printf("ON\n");
			} else {
				System.out.printf("OFF\n");
			}
		}

		// 정수를 입력받아서 소수인지 판별
		// 소수는 2부터 자신의 절반까지 나누어서 한번도 나누어 떨어지지 않으면 소수
		Scanner sc = new Scanner(System.in);
		System.out.printf("소수인지 판별할 숫자 입력(1보다 큰 숫자):");
		int su = sc.nextInt();
		// idx를 2부터 자신의 절반까지 하나씩 증가시키면서
		int AAA = 0;

		for (int idx = 2; idx <= su / 2; idx = idx + 1) {
			// 누누어 떨어지면 반복문을 종료
			if (su % idx == 0) {
AAA = 1;
				break;

				
			}

		}
			if(AAA == 0) {
				System.out.printf("%d는 소수\n" , su);
			}else {
				System.out.printf("%d는 소수 아님\n" , su);
}
		sc.close();
	}
}

























