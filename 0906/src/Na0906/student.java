package Na0906;

public class student {
	// 이 코드 블록은 크래스를 처음 사용하기 위해서 메모리에 로드될 떄 바로 실행됨.
	static {
		System.out.printf("오케이 한시간 확인\n");
	}
	// 학교 이름, 학생 이름, 전화번호, 학번을 저장 할 수 있는 변

	// 모든 학생의 학교 이름은 동일.
	// 이런 경우에는 static으로 선언해서 1개만 생성해서 공유하는 것이 좋음.
	static String schoolName;

	String studentName;

	// 접근 지정자를 private으로 설정하면 클래스 외부에서 사용이 불가능함.
	//private String Phone;

	// 접근 지정자를 public으로 설정하면 클래스 외부에서 객체가 사용 가능함.
	public String num;

	public void func() {
		System.out.println("첫 메소드");
		// 클래스 안에서 만들어진 다른 메소드 호출
		method();
	}

	public void method() {
		System.out.println("안 메소드");
	}

	public void noarg() {
		// java를 3번 출력
		for (int i = 0; i < 3; i = i + 1) {
			System.out.printf("java\n");
		}
	}

	public void onearg(int n) {
		for (int i = 0; i < n; i = i + 1) {
			System.out.printf("java\n");
		}
	}
	
	//매개변수의 자료형이 기본형인 경우
	public void value(int n) {
	 n= n+1 ; //n의 값을 1증가
	 System.out.printf("n:%d\n",n);
	}
	//매개변수의 자료형이 기본형이 아닌경우
	public void reference (int [] ar) {
		ar[0] = ar[0] +1 ;
		System.out.printf("ar[0]:%d\n" , ar[0]);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

