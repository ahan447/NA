package highlevelthreading;

import java.util.concurrent.Callable;

//생성자가 정수 1개를 대입받고 1부터 그 점수까지으 ㅣ합을
//계산한 후 리턴하는 스레드

public class ThreadEx implements Callable<Integer>{
		private int n;
		
		
		public ThreadEx(Integer n) {
			//기본형과 Wrapper는 바로 대입 가능
			//Boxing & UnBoxing 이라고 함.
			//this.n = n.intValue()가 수행
			this.n = n;
		}


		@Override
		public Integer call() throws Exception {
			int total = 0;
			for(int i=1; i<=n; i=i+1) {
				total = total + i;
			}
			return total;
		}
}
