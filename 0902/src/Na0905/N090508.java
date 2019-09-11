package Na0905;

import java.util.Scanner;

public class N090508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// 정수 6개를 저장할수 있는 배열 만들기
		int[] a = new int[6];
		// 일반적인 for구문을 이용해서 a배열의 데이터 순회하기
		int len = a.length;
		for (int i = 0; i < len; i = i + 1) {
			System.out.printf("숫자를 입력하세요(1~45 사이):");
			a[i] = sc.nextInt();
			// 1부터 45사이의 숫자가 아니면 다시 입력받기
			if (a[i] < 1 || a[i] > 45) {
				System.out.printf("1~45 사이의 숫자를 입력하세요!!!\n");
				i = i - 1;
				continue;
			}
			// 이전에 입력한 데이터와의 중복 검사
			// 중복 검사 통과 여부를 확인할 변수
			int flag = 0;
			// 데이터 중복 검사를 수행해서 동일한 데이터가 있으면 falg = 1
			for (int j = 0; j < i; j = j + 1) {
				if (a[i] == a[j]) {
					flag = 1;
				}
			}

			if (flag == 1) {
				System.out.printf("중복된 번호입니다. 다시 입력하세요.\n");
				i = i - 1;
			}

		}
		// 데이터 정렬 - 선택 정렬
		// n-1 회전 동안 자신의 뒤에 있는 모든 데이터와 비교해서 정렬
		len = a.length;
		for (int i = 0; i < len - 1; i = i + 1) {
			for (int j = i + 1; j < len; j = j + 1) {

				// 데이터를 비교해서 앞의 데이터가 더 크다면 swap
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		// 데이터 출력
		for (int temp : a) {
			System.out.printf("%d\t", temp);

		}

		sc.close();

	}

}
