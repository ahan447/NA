package 데이터정렬ex게식판;

enum Sports{
		Baseball, Soccer, volleyball, Basketball
}

public class EnumMain {

	public static void main(String[] args) {
		//열거형 상수 변수에는 열겨형 상수 중의 하나만 대입이 가능
		Sports v = Sports.Baseball;
		System.out.println(v);	//열거형 상수 이름이 나옴
		System.out.println(v.ordinal());	//인데스를 출력
		//final static 을 이용해서 욥션을 만드는 것보다
		//enum을 사용하는 것을 고급 프로그래밍 기법으로 취급
		
		
		
		
		

	}

}
