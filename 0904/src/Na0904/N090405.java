package Na0904;

public class N090405 {

	public static void main(String[] args) {
		// 601을 3번 출력 - do~while 이용
		int A = 0;
		do {
			System.out.printf("A:%d\n" , A+1);
			A = A + 1;
		} while(A < 3);
		
		
		//1 - 10 까지의 합계
		//1 + 2 + 3 + 4 + ... + 10
		int i = 1;
		//합계를 저장할 변수
		int B = 0;
		
		do {
			
			//합을 구할 내용을 기존의 합계에 추가
			B = B + i;
			
			i = i + 1;
		}while(i <= 10);
		System.out.printf("합계:%d\n" , B);
		
		
		
		
		//image1.png,image2.png, image3.png 를 반복문을 이용해서 출력
		
		int C = 0;
		do {
			
			C = C + 1;
			System.out.printf("inmage%d.png\n" , C);
			}while(C < 3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
