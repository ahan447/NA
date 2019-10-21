package java1021Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMain1 {

	public static void main(String[] args) {
	/*	List<String> list =
				new ArrayList<>();
		list.add("육회");
		list.add("오뎅탕");
		list.add("곱창전골");
	*/
		String [] list =
			{"육회" , "오뎅탕" , "곱창전골" ,"김치찌개"};
		//일반 반목문을 이용해서 접근
		int i = 0;
		//int len = list.size();
		int len = list.length;
		while(i < len) {
			//데이터를 가져오기
			//String item = list.get(i);
			String item = list[i];
			//가져온 데이터를 가지고 작업 - 출력
			System.out.printf("%s\n", item);
			//인덱스 변수 증감
			i = i + 1;
			
		}
		System.out.printf("==================\n");
		//iterator(cursor - 반복자)
		//데이터를 가져온  위치에 대기하고 있다가
		//다음 데이터를 찾아가는 방법
		//배열에서는 사용 못함
	/*	Iterator<String> iterator = 
				list.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			System.out.printf("%s\n", next);
			
		}
	*/	System.out.printf("==================\n");
		//위에 방법은 전에 사용하던 방식
		//최근에서는 위의 방식을 개선해서 Fast Enumeration 제공
		//언어에 따라 Map 도 이 방식이 가능(Java는 안됨)
		for(String temp : list) {
			System.out.printf("%s\n", temp);
			
		}
		System.out.printf("==================\n");
		//위의 문장을 조금 더 간결하게 작성
		Stream<String> stream =
				//list.stream();
				Arrays.stream(list);
				stream.forEach(name -> System.out.println(name));
		
		
		
	}

}
