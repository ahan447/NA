package Moo;

public class Main3 {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i = i + 1) {
			System.out.printf("i:%s\n", i + 1);

			// 이렇게 Main에 thread를 만들면 예외가 발생한 경우 운ㄴ영체제가 처리함.
			// main은 운영체제가 호출하기 때문.
			Thread.sleep(100);

			/*
			 * try {
			 * 
			 * Thread.sleep(1000); //1초씩 대기
			 * 
			 * } catch (InterruptedException e) { // TODO Auto-generated catch block
			 * System.out.printf("인터럽트 예외 발\n"); System.out.printf("예외:%s\n" ,
			 * e.getMessage());
			 * 
			 * e.printStackTrace(); }
			 * 
			 */
			// Scanner 를 사용하는 경우 close()를 호출하지 않으면
			// 메모리 누수(leak)가 발생한다고 경고가 보임.
			// 이렇게 try안에서 만들면 자동을 마지막에 close()를 호출하므로
			// 경고가 발생하지 않음.
			//try (Scanner sc = new Scanner(System.in);) {
			//	sc.hasNextInt();
			//}
		}

	}
}
