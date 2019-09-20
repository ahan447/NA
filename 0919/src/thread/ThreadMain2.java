package thread;

public class ThreadMain2 {

	public static void main(String[] args) {
		//Thread 클래스로부터 상속받은 클래스의 객체를 생성
		ThreadEx02 th1 = new ThreadEx02();
		//스레드 시작
		th1.start();
		
		//anonymous class를 이용하는 방법
		Thread th2 = new Thread() {
			public void run() { 
				for(int i = 0; i <5; i=i+1) {
					try {
						Thread.sleep(1000);
						System.out.printf("스레드%s\n", i);					
					}catch(Exception e) {}
				}
			}
		};
		th2.start();

		//Runnable 인터페이스를 이용하는 방법
		Runnable r = new Runnable() {

			@Override
			public void run() {
				for(int i = 0; i <5; i=i+1) {
					try {
						Thread.sleep(1000);
						System.out.printf("Runnable%s\n" , i);
						//System.out.printf("=====================%s\n" , i);
					}
					//스레드를 강제로 종료 할 수 있도록 만들고자 할때
					//InterruptedException 이 발생하면
					//return 하도록 코드를 작성
					catch(InterruptedException e) {}
					return;
				}
				
			}
			
		};
		//Runnable 인터페이스를 이용하는 경우에는
		//Thread 클래스의 객체를 만들고 그 객체를 가지고 start
		Thread th3 = new Thread(r);
		th3.start();
		
		Thread th4 = new Thread() {
			//10초동안 1초씩 쉬면서 10초작업이라는 문자열을 출력
			@Override
			public void run() {
				for(int i = 0; i <10; i=i+1) {
					try {
						Thread.sleep(1000);
						System.out.printf("10초 작업%s\n" , i);					
					}catch(Exception e) {}
				}
				
			}
		};
		//데몬 스레드로 설정 - 다른 스레드들이 작업을 하는 동안만 이 스레드는 동작함.
		//데몬 설정이 시작보다 먼저 나와야 함.
		//시작한 다음에는 못바꿈.
		//th4.start();	
		th4.setDaemon(true);
		th4.start();
		th1.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(Thread.MAX_PRIORITY);
		th3.setPriority(Thread.MIN_PRIORITY);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
