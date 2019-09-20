package concurrentthread;
	//Thread 클래스로부터 상속받은 클래스
	//상속을 받은 클래스이름을 만들 떄는
	//상위 클래스 이름 뒤에 Ex를 붙이는 경우가 많음

	//인터페이스를 구현 했을 떄는 ImpI을 붙이는 경우가 많음.
	
	//스레드 자신의 이름을 1초마다 5번 출력하는 스레드
public class ThreadEx extends Thread {
	public void run() {
		for(int i=0; i<5; i=i+1) {
			try {
				Thread.sleep(1000);
			System.out.printf("%s\n" , this.getName());	
			
			}catch(Exception e) {}
		}
	}
	
	
	
}
