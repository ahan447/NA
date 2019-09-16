package lang;

public class StringMain5 {

	public static void main(String[] args) {
		//좌표를 저장할 변수
		int x = 200;
		int y = 300;
		//x=200,y=300의 형태로 출력
		//String msg = "x=" + x + "y=" + y;
		//System.out.printf("x=%d,\ty=%d\n" ,x , y);		
		
		
		//System.out.printf 대신에 Stringformat을 사용
		//문자열이 출력되지 안혹 문자열을 만들어서 리턴해줌
		String msg = String.format("x=%d,\ty=%d\n" ,x , y);
		System.out.printf("%s\n", msg);
				
		
		msg = "타인은지옥이다";
			byte [] bytes = msg.getBytes();
			//각 바이트 코드 값을 출력
		for(byte imsi : bytes) {
			System.out.print(imsi);
		}
		
		System.out.printf("\n================================\n");
		//	byte 배열을 가지고 문자열로 복원
		//받는 쪽이나 파일의 내용을 읽을 떄 수행
		String result = new String(bytes);
		System.out.println(result);
	}
	

}
