package lang;

public class StringMain3 {

	public static void main(String[] args) {
		//String 클래스의 split 메소드 활용하기
		
		//구분자로 구분된 문자열을 csv라고 함.
		String data = "87,67,64,89";
		
		//위의 문자열을 , 단위로 구분해서 출력
		//String 의 split 이용
		//문자열을 regexp를 기준으로 분활해서 문자열 배열을 리턴함.
		
		String [] result = data.split(",");
		
		for(String temp : result) {
			System.out.println(temp);
		}
		
		
	
		//만들어진 문자열을 정수로 변환해서 합계를 출력
		//정수 변환는 Integer.parseInt()
		/*int len = data.length();
		int x = 0;
		for(int i = 0 ; i <len; i=i+1 ) {
			x= x + data[i] ;
		}
			System.out.printf("%s\n",x);
		*/
		int sum= 0;
		for(String temp : result) {
			sum = sum + Integer.parseInt(temp);
		}
			System.out.println(sum);
		
		
		
		
		
		
		
		System.out.printf("");
		
		//중간에 변환되지 않는 문자열을 삽입해서 변환되지 않는 경우에는 0으로 계산
		//예외 처리는 try ~ catch 이용
		
		String data2 = "98,87,-,88";
		//위의 data를 가지고 작업 - 변환이 안되는 경우는 0으로 간주
		result = data2.split(",");
		
		int sum2= 0;
		for(String temp : result) {
			//숫자로 변환하다가 예외가 발생하면 0을 더하도록 하고 계속 수행하도록 함.
			//숫자 앞 뒤에 공백이 있는 경우는 공백을 제거하도록
			// trim()을 호출해서 공백을 제거		
			try {
			sum2 = sum2 + Integer.parseInt(temp.trim());
		}catch(NumberFormatException e) {
			sum2 = sum2 + 0;
		}
		}
			System.out.println(sum2);
		
		
		
		
		
		
		
		
		
		
		System.out.printf("");
		
	}

}
