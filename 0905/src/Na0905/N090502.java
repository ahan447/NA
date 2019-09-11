package Na0905;

public class N090502 {

	public static void main(String[] args) {
		// 데이터를 처음부터 가지고 배열을 생성
		int [] scores = {5, 10, 55, 25, 30};
		
		//배열의 데이터 개수를 확인
		//배열의 데이터 개수는 length(렌스)속성을 이용
		System.out.printf("scores의 데이터 개수 : %d\n" , scores.length);

		
		//배열의 두번째 요소를 출력
		//배열을 가지고 요소를 찾을 떄는 [인덱스]
		//인덱스는 0~length-1 까지
		System.out.printf("scores의 두번째 데이터 : %d\n" , scores[1]);
		
		
		//br 이라는 배열이름을 생성함.
		//=을 한적이 없기 때문에 실제 데이터는 소유하지 않음.
		//이런 경우 .을 속성을. 호출하면 에러(실행 안됨)는 아니고
		//예외(실행은 되는데 문제 발생)가 발생
		//단언(강제로 예외를 발생시키는 것)
		//int [] br = null;
		//nullpointerexception : 참조형이 가리키는 데이터가 없어서 발생
	
		
		int [] br = new int [4] ; //4개를 저장할수 있는 배열 생성
		
		System.out.printf("br의 데이터 개수 : %d\n" , br.length);
		
		//데이터가 4개인데 4번에 접근하면 잘못된 인덱
		//ArrayIndexOutOfBoundsException 발생
		//System.out.printf("br의 두번째 데이터 : %d\n" , br[4]);
		
		System.out.printf("br의 두번째 데이터 : %d\n" , br[1]);
		
	}

}
