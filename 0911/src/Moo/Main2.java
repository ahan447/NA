package Moo;

public class Main2 {

	public static void main(String[] args) {
		//블럭이 3개 다 다르기 때문에 공통된 변수를 사용하려면 구문 밖에 만들어야함
		String [] languages = {"java" , "javaScript", "Kotlin" , "swift"};
		int x = 10;
		try {
			// 예외가 발생할 가능성이 있는 구문
			System.out.printf("x/0:%d\n" , x/0);
			//<= 이기때문에 오류 발생
			 for(int i=0; i<=languages.length; i=i+1) {
			 
				System.out.printf("프로그래밍 언어:%s\n" , languages[i]);
			}
			//여러 종류의 예외를 묶어서 처리하기 위해서 Exception을 사용 
		}catch (Exception e){
			//예외 클래스에 해당하는 예외가 발생했을 때 처리할 구문
			//Exception 클래스의 getMessage()는 예외 내용을 문자로 리턴
			System.out.printf("예외:%s\n", e.getMessage());
		}
		/* 
		catch (ArrayIndexOutOfBoundsException e) {
			// 예외 클래스에 해당하는 예외가 발생했을 때 처리할 구문
			System.out.printf("배열의 인덱스 오류\n");
		}catch(ArithmeticException e) {
		System.out.printf("잘못된 산술연산의 오류\n");
					
		} 
		*/
		finally {
			// 예외 발생 여부에 상관없이 수행할 구문
			System.out.printf("무조건 수행할 구문\n");

		}
	}

}
