package java1018UseLambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda3 {

	
	public static void main(String[] args) {
		//문자열을 저장하는 List를 생성하고
		//데이터를 저장
		List<String> list =
				new ArrayList<String>();
		list.add("요한 크루이프");
		list.add("마르코 반바이스텐");
		list.add("루드 굴리트");
		list.add("패트릭 클라이베르트");
		list.add("데니스 베르캄프");
		
		//위의 데이터를 순서대로 하나씩 출력
	
	//1	for(int i=0; i<list.size(); i=i+1) {
	//1		System.out.println(list.get(i));
	//1	}
	//2	for(String imsi : list) {
	//2		System.out.println(imsi);
	//2	}	
		
		//List에 함수를 매개변수로 대입해서
		//Lost의 모든 데이터를 함수의 매개변수로 대입해서 실행
		//이 기능은 C언어를 제외한 거의 모든 프로그래밍
		//언어에 존재하는 기능인데 대부분은 map이라고함
		//3	list.forEach(System.out::println);
		
		
		

	
	
		
		
		
			
		
		
		
		
		
		
		
}
}