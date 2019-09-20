package thread;

public class ThreadEx02 extends Thread {
	//스레드로 수행할 내용을 가지는 메소드
	@Override
	public void run() {
		//1초 마다 쉬면서 Hello Java 를 5번 출력
		for(int i = 0 ; i<5; i=i+1) {
			try {
				Thread.sleep(1000);
				System.out.print("Hello Java\n");
			}catch(Exception e) {
				System.out.printf("%s\n" , e.getMessage());
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
