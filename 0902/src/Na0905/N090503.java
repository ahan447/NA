package Na0905;

public class N090503 {

	public static void main(String[] args) {
		// 배열 만들기
		String [] AAA = {"양씨", "박씨", "주씨", "김씨"};

		//	배열의 데이터 전체 접근 - 데이터 개수를 리터럴로 작성
		for(int a = 0; a < 4; a=a+1) {
			System.out.printf("%s\n" , AAA[a]);
			
		}
		System.out.printf("============================1\n");
		//데이터 개수를 속성을 이용해서 설정
		//데이터에 변화개 생겨도 출력부분을 수정할 필요가 없음.
		for(int a = 0; a < AAA.length; a=a+1) {
			System.out.printf("%s\n" , AAA[a]);
			
		}
		System.out.printf("============================2\n");
		//자주 사용하는 데이터가속성의형태로 있다면 매번 이름을 찾아서 접근하난 것은
		//시간 낭비가 될 수 있음.
		//이런 경우에는 속성을 임시변에 대입해서 사용하면 접근 속도가 향상될 수 있음.
		int len = AAA.length;
		for(int a = 0; a < len; a=a+1) {
			System.out.printf("%s\n" , AAA[a]);
		}
		System.out.printf("============================3\n");
		
		//빠른 열거 사용
		for(String name : AAA) {
			System.out.printf("%s\n" , name);
		}
		
		
		
	}

}
