//이 클래스의 소속을 나타내기위한 명령문
//소속은 없거나 하나여야 함.

//아무곳에서나 사용 할 수 있는 First 클래스를 생성
//yang jaegeon
public class Happy {
//실행 할 수 있는 메소드 main 메소드만 실행됩니다.
	//entry point - 하나만 있어야 합니다.
	public static void main(String[] args) {
		//System.out.println("첫 수업 첫 자바 프로그램");
//나이와 뭄무게를 저장해서 출력
		// 어떤 데이터를 저장해두고 사용할 ㅅ때는변수를 생성해서 저장
		//변수를 만들 때는 어떤 정류의 데이터를 저장할 것인지 자료형을 결졍해야함
		//나이는 정수 ,몸무게는 실수
	int age = 28;
 double weight	 = 61.2;
	
	//데이터 출력
System.out.println("나이:" + age);
System.out.println("몸무게:" + weight);

//char는 저장은 정수를 하고 다가 출력할 떄는 문자로 변환해서 출력
//48이 숫자 0,65가 대문자 A, 97이 소문자 a
 char ch = 100;
System.out.println("ch:" + ch);


char AA = 97;

System.out.println("AA:" + AA);

System.out.println(AA  + "\n" + ch);


	}

}
