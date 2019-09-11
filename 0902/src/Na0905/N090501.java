package Na0905;

public class N090501 {

	public static void main(String[] args) {
		// 2부터 1000까지 소수의 개수 세기
		// 소수 : 2부터 자신의 절반이 숫자까지 나누어서 한번도 나누어 떨어지지않는 숫자

		// 변수 하나 넣고 조건 만족시 하나씩 플러스
		int a = 0;

		for (int b = 2; b < 1001; b = b + 1) {
				//소수판별을 위한 변수
			int A = 0;
			
			// 소수판별
			for (int c = 2; c <= b / 2; c = c + 1) {
				if (b % c == 0) {
					A = 1;
					break;
				}
			}
			// 소수라면 a값 하나 올리기
			if (A == 0) {
				a = a + 1;
			}
		}
		System.out.printf("2부터 1000까지의 소수수:%d\n", a);
	}

}
