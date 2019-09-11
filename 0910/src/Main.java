
public class Main {

	public static void main(String[] args) {
		
		
		
		//현재는 Star 클래스가 abstract 클래스가 아님
		//abstract class가 아니여서 객체 생성이 가능
		//Star 클래스 의 class 앞에 abstract를 추가하면 에러
		//Star star = new Star();
		
		
		
		
		
		//portoss 클래스의 인스턴스 생성
		Protoss p = new Protoss();
		p.attack();
		
		//Zerg 클래스의 인스턴스 생성
		Zerg z = new Zerg();
		z.attack();
		
		//Terran 클래스의 인스턴스 생성
		Terran t =new Terran();
		t.attack();
				
		
		
	}
	

}
