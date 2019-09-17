package 데이터정렬ex게식판;

//T라는 미지정 자료형을 생
public class Generic<T> {

	//미지정 자료형의 배열을 생성
	private T [] data;
	//데이터를 대입받아서 인스턴스 속성에 대입하는 생성자
	//매개변수에 ...이 있으면 varargs라고 하는데
	//매개변수를 개수에 상관없이 대입할 수 있음.
	//메소드 내에서는 배열이 간
	public Generic(T...n) {
		data= n;
		}
	
	//data의 내용을 출력하는 메소드
	public void display() {
		//빠른 열거를 이용한 배열의 데이터 접근
				for (T temp : data) {
					System.out.println(temp);
				}
	}
	
	
	
}
