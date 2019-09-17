package 데이터정렬ex게식판;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListMain2 {

	public static void main(String[] args) {
		// 테이블 구조 들기
		List<Person> list = new ArrayList<>();
		//	테이블에 삽입할 데이터를 생성
		Person Person = new Person();
		Person.setName("양씨");
		Person.setPhone("0107345");
		Person.setAddress("서울");
		Person.setAge(28);
		
		//테이블에 데이터를 삽입하기
		list.add(Person);
		
		
		Person = new Person();
		Person.setName("주씨");
		Person.setPhone("0106341");
		Person.setAddress("세종");
		Person.setAge(27);
		
		
		//테이블에 데이터를 삽입하기
		list.add(Person);
		
		//데이터 정렬(sort)
		list.sort(new Comparator<Person>(){

			//나이를 가지고 비
			@Override
			public int compare(데이터정렬ex게식판.Person o1, 데이터정렬ex게식판.Person o2) {
				// TODO Auto-generated method stub
				return -o1.getAge() + o2.getAge();
			}});
		
		
			
		//타이틀을 출력
		System.out.printf(
				"%-10s%-15s%-20s%-3s\n", 
				"이름" , "전화번호", "주소", "나이");
		
		//Fast Enumeration 을 이용한 접근
		for(Person p : list) {
			System.out.printf(
					"%-10s%-17s%-20s%-3s\n", 
					p.getName() , p.getPhone(), p.getAddress(), p.getAge());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
}
