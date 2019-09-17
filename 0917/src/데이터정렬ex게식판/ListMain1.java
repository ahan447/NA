package 데이터정렬ex게식판;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain1 {

	public static void main(String[] args) {
		// 문자열을 저장하는 ArrayList를 실행
		List<String> al = new ArrayList<>();
		List<String> li = new LinkedList<>();

		al.add("강감찬");
		li.add("강감찬");

		al.add("조헌");
		li.add("조헌");

		// 현재 시간을 기록
		long start = System.currentTimeMillis();
		// 첫번쨰 자리에 100000개를 삽입
		for (int i = 0; i < 100000; i = i + 1) {
			li.add(1, "을지문덕");
		}
		// 현재 시간을 기록
		long end = System.currentTimeMillis();
		System.out.printf("LinkedList : %d\n", (end - start));

		// 현재 시간을 기록
		start = System.currentTimeMillis();
		// 첫번쨰 자리에 100000개를 삽입
		for (int i = 0; i < 100000; i = i + 1) {
			al.add(1, "을지문덕");
		}
		// 현재 시간을 기록
		end = System.currentTimeMillis();
		System.out.printf("ArrayList : %d\n", (end - start));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		start = System.currentTimeMillis();
		int size = al.size();
		for (int i = 0; i < size; i = i + 1) {
			String data = al.get(i);
			System.out.printf("%s\n", data);
		}

		end = System.currentTimeMillis();
		System.out.printf("%d\n", (end - start));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
