package java1022DesignPattern;

public class SingleTon {
	//생성자를 private으로 만들어서
	//외부에서 객체를 생서앟ㄹ 수 없도록 함
	private SingleTon() {}
	
	//객체의 참조를 저장할 변수를 생성
	private static SingleTon singleTon;
	
	//객체를 생성해서 참조를 넘겨주는 메소드
	public static SingleTon sharedInstance() {
		if(singleTon == null) {
			singleTon = new SingleTon();
		}
	return singleTon;
	}
	
}
