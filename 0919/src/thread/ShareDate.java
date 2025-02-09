package thread;

public class ShareDate extends Thread implements Runnable {

	
	
	//합계를 저장할 변수
	private int result;
	//인덱스 변수
	private int idx;
	
	// idx 를 10000번 정도 증가시키면서 result에 더하는 메소드
	//synchronized 가 붙은 메소드는 자신의 작업이 완료되기 전에는
	//다른 작업을 할수 없도록 함.
	private synchronized void sum() {
		for(int i=0;i<10000; i=i+1) {
			try {
				//이 영역에서 사용중인 데이터는
				//다른곳에서 수정할 수 없도록 함.
				synchronized(this) {
				idx = idx +1;
				Thread.sleep(1);
				result = result +  idx;
				}
			}catch(Exception e) {}
			
		}
	}
	
	
	
	//스레드로 동작할 내용을 가진 메소드
	@Override
	public void run() {
		sum();
	}

	//result를 리턴한느 메소드
	public int getResult() {
		return result;
	}
	
	
}
