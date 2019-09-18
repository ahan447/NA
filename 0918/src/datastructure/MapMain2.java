package datastructure;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person 클래스의 객체를 만들어서 데이터를 저장
		Person person = new Person();
		
		person.setName("양씨");
		person.setAge(28);
		person.setJob("학생");
		
		//Person 객체의 내용을 하나씩 출력
		System.out.printf("이름:%s\n", person.getName());
		System.out.printf("나이:%s\n", person.getAge());
		System.out.printf("직업:%s\n", person.getJob());
		
		
		
		//Map에 데이터를 저장
		Map<String, Object> map =
				new LinkedHashMap<String , Object>();
		map.put("이름" , "리처드 스틀만");
		map.put("나이", 66);
		map.put("직업" , "개발자");
		map.put("철학" , "지유 소프트웨어는 자유지 공짜가 아니다.");
	
		
		System.out.println();
		
		//모든 key를 전부 가져오기
		Set <String> keyset = map.keySet();
		
		//데이터 출력 - map에 변화가 생겨도 이 부분은 수정할 필요가 없음
		//Apple은 데이터를 Map 구조로 넘기는 것을 많이 함.
		for(String key : keyset) {
			System.out.printf(
					"%s:%s\n", key,map.get(key));
			
		}
		
		
		
		
		
		
	}

}
