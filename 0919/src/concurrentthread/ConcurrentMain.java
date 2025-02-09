package concurrentthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentMain {

	public static void main(String[] args) {
		//스레드 0개를 생성해서 실행
		/*
		for(int i = 0 ; i<10; i=i+1) {
			ThreadEx th = new ThreadEx();
			th.start();
		}
		*/
		
		//코어 개수 찾아오기
		//Runtime 클래스는 생성자를 이용해서 객체를 생성하지 않고
		//getRuntime()이라는 자신의 Static 메소드로 객체를 생성
		//이렇게 만든 이유는 Singleton(객체를 1개만 생성)
		//디자인 패턴을 적용하기 위해서 임.
		int core =
				Runtime.getRuntime().availableProcessors();
		
		//코어 개수만큼 스레드를 만들어서 실행시켜주는 ThreadPool 생성
		ExecutorService service = 
				Executors.newFixedThreadPool(core);
		for(int i=0; i<10; i=i+1) {
			ThreadEx th = new ThreadEx();
			service.submit(th);
		}
		
		service.shutdown();
	}

}
