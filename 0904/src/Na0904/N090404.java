package Na0904;

public class N090404 {

	public static void main(String[] args) {
		//hello java 라는 문장을 3번 출
		//동일한 문장을 연속해서 작성하는 경우 유지보수가 어려워짐
		//5번 출력하는 것으로 변경 - 2번 더 작성
		//hello 601 으로 변경 - 3번 변경
		
		System.out.printf("hello java\n");
		System.out.printf("hello java\n");
		System.out.printf("hello java\n");
		
		System.out.printf("=====================\n");
		
		//반복문을 이용해서 3번 출력
		// 반복 횟수를 파악하기 위한 변수
		
		//반복문을 사용하면 수정시 적은 횟수로 수정 가능(단순 반복에 비해(위에 3번에))
		
		
		int AB = 0;
		//AB 가 3보다 작으면 반복 수행
		while(AB<4) {
			System.out.printf("hello java\n");
		AB = AB + 1; //AB++ , AB += 1 도 가능
		}
		
		int i = 0;
				while(i<3){
				System.out.printf("i:%d\n", i);
				i = i + 1;
				}
		
		
		
		
	}

}
