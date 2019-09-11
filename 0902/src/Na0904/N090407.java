package Na0904;

public class N090407 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 1; a <= 10; a = a + 1) {
			if (a % 3 == 0) {

				// 1,2 이후 3의 배수 3이 나오면 반복 중지
				// break;

				// 3의 배수가 나오면 빼고 다시 반복
				continue;

			}

			System.out.printf("a:%d\n", a);
		}
	}

}
