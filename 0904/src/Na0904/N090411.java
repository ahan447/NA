package Na0904;

public class N090411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 0***** 0-4 1***** 0-4 2***** 0-4 3***** 0-4 4***** 0-4
		 * 
		 */
		for (int i = 0; i < 5; i = i + 1) {
			for (int j = 0; j < 5; j = j + 1) {
				System.out.printf("*");

			}
			System.out.printf("\n");
		}

		/*
		 * 0* 0-0 1** 0-1 2*** 0-2 3**** 0-3 4***** 0-4
		 * 
		 */
		System.out.printf("\n");
		System.out.printf("\n");

		for (int a = 0; a < 5; a = a + 1) {
			for (int b = 0; b < a + 1; b = b + 1) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}

		/*
		 * 0***** 0-4 1**** 0-3 2*** 0-2 3** 0-1 4* 0-0
		 */

		System.out.printf("\n");

		for (int c = 0; c < 5; c = c + 1) {
			for (int d = 0; d < 5 - c; d = d + 1) {

				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		/*
		 * 0* 0-0 1** 0-1 2*** 0-2 3** 0-1 4* 0-0
		 */
		// 일정한 패턴이 나오다가 다른 패턴을 ㅗ변경되는 경우에는 변경되는 시점에서
		// 코드를 분활하면 됨.

		System.out.printf("\n");
		System.out.printf("\n");

		for (int e = 0; e < 5; e = e + 1) {
			// 3번째 줄 까지의 규칙
			if (e <= 2) {
				for (int o = 0; o < e + 1; o = o + 1) {
					System.out.printf("*");
				}
			} else {
				for (int o = 0; o < 5 - e; o = o + 1) {
					System.out.printf("*");
				}
			}
			System.out.printf("\n");
		}
		for (int i = 0; i < 5; i = i + 1) {
			// 공백 출력
			for (int j = 0; j < 4 - i; j = j + 1) {
				System.out.printf(" ");
			}
			System.out.printf("*");
			System.out.printf("\n");
		}

		System.out.printf("\n");

		for (int i = 0; i < 6; i = i + 1) {
			// 공백 출력
			for (int j = 0; j < 4 - i; j = j + 1) {
				System.out.printf(" ");
			}
			System.out.printf("*");
			if (i == 5) {
						for( int a=0; a<2*i+1; a= a+1) {
				System.out.printf("*");}}else{{
				
					
				
					
					
					for( int a=0; a<2*i+1; a= a+1) 
					
					
					{
						System.out.printf(" ");	}
					System.out.printf("*");
					}
			}
			System.out.printf("\n");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
