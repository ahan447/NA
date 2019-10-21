package java1021Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReduceMain1 {

	public static void main(String[] args) {
		String [] ar =
			{"금요일밤", "아쉽지만", "영준형","소개는" ,"물건너", "간걸로..",
					"나는","오지게","술먹어야징~~",
					"소주","소맥","맥주","마지막은","다시","소주"};
		//배열을 이용해서 Stream을 생성
		Stream <String> stream =
				Arrays.stream(ar);
		//중복 제거
	/*	stream.distinct().forEach(
				name ->System.out.println(name));
	*/	
	//	stream.limit(2).forEach(
	//			name -> System.out.printfln(name));
		int len = ar.length/4 +1;
		for (int i = 0; i<len; i=i+1) {
			Stream<String> imsi = Arrays.stream(ar);
					imsi.skip(i*4).limit(4).forEach(name ->
					System.out.println(name));
					try {
						Thread.sleep(1000);
					}catch (Exception e) {}

					}
			
				
		
	}

}
