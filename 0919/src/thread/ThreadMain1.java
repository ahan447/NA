package thread;

public class ThreadMain1 {

	public static void main(String[] args) {
		ThreadEx th1 = new ThreadEx();
		//th1.run(); //프로세서 형태로 실행
		//이 메소드의 수행이 종료될 때 까지 다른 메소드 호출이 안됨.
		
		//th1.start(); // 스레드로 수행
		//실행 도중에 쉬는 시간이 생기거나 CPU가 필요없는 작업이 생기면 다른 스레드를 실핼 할 수 있음.
		
		ThreadEx th2= new ThreadEx();
		//th2.run();
		//th2.start(); 
		
		ThreadEx02 th3 = new ThreadEx02();
		//th3.run();
		th3.start(); 
		
		
	}

}
