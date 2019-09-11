package N001;

public class outer {
	
	//클래스 안에 만들어 진 내부 클래스
	//이 클래스는 Outer 안에서만 사용이 가능
	//대신에 public 이기 때문에 Outer 객체는 접근이 가능.
	
	//public static class Inner{ //내부 클래스에 static이 있는 경우 클래스에 static를 추가해 주어야 함.
	public class Inner{
		
	//	public static void innerMethod() { //static 추가
		
		public void innerMethod() {
			System.out.printf("내부 클래스의 메소드\n");
		}

	
	}
	public void outMethod() {
		//Inner 클래스의 객체 만들기
		Inner Inner = new Inner();
		Inner.innerMethod();
	}

}
