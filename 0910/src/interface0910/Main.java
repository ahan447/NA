package interface0910;

public class Main {

	//Main 클래스 안에서 String 클래스가 사용됨 -has a
	//이 경우는 인스턴스 변수로 선언되서 Main과 수명이 같아서 composition
		String str;
	public static void main(String[] args) {
		String str; //aggregation
		
		//ServiceImpl 객체를 생성
		//ServiceImpl service01 = new ServiceImpl();
		
		//인터페이스를 implements 한 클래스의 객체를 만들 떄는
		//변수를 만들 때 인터페이스 이름을 사용하기도 함.
		service01 service01 = new ServiceImpl();
		
		service01.insert();
		service01.read();
		service01.update();
		service01.remove();
		
		
		
		
	}

}
