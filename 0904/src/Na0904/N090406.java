package Na0904;

public class N090406 {

	public static void main(String[] args) {
		// hello java를 3번 출력 - for 이용
		// for(처음수행되는식; false가 나오면 반복문을 중단하는 식; 두번째부터 수행되는식)
		// {반복할 내용}
		// while은 반복조건을 하나씩 세로로 작성하지만
		// for는 가로로 하나의 행에 작

		for (int A = 0; A < 2; A = A + 1) {
			System.out.printf("hello java\n");
		}

		// 1부터 10까지의 짝수 합계 - for 이용
		int c = 0;
		for (int b = 0; b < 11; b = b + 1 * 2) {
			c = b + c;

		}
		System.out.printf("1부터 10까지짝수의 합:%d\n", c);
	}

}
