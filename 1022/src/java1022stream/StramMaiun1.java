package java1022stream;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StramMaiun1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//여러 개의 Student 객체를 저장
		//동일한 모양 여러 개 - 배열,List
		//다른 모양 여러 개 - DTO 생성, Map
		
		//LinkedList : 다음 데이터를 가르키는 포인터를 소유한 리스트
		
		//삽입 및 삭제가 빈번한 경우에 사용
		//읽기만 하는 경우에는 속도가 느려서 못씀
		LinkedList<Student> list =
				new LinkedList<>();
		list.add(new Student(
				1, "마빈헤글러", "남자", 98));
		list.add(new Student(
				2, "나브라틸로바", "여자", 78));
		list.add(new Student(
				3, "조몬타나", "남자", 86));
		list.add(new Student(
				4, "카타리나비트", "여자", 85));
		list.add(new Student(
				5, "웨인그레츠키", "남자", 89));
		list.add(new Student(
				6, "그리피스조이너", "여자", 93));
		
		//List를 스트림으로 생성
		Stream<Student>stream =
				list.stream();
		//스트림.중간연산.최종연산
		//중간연산은 생략 가능하고 중복가능
		//최종연산은 필수이고 1번만 사용 가능
/*		stream.filter(student -> {
			return student.getGender().equals("여자");
		}).forEach(student->{
			System.out.println(student);
		});
*/		
		
/*		long cnt = stream.filter(student -> {
			return student.getGender().equals("여자");
		}).count();
			System.out.printf("여자 : %s명\n" ,cnt);
	}
*/
/*		int sum = stream.filter(student -> {
			return student.getGender().equals("여자");
		}).mapToInt(Student::getScore).sum();
			System.out.printf("여자 점수 합계 : %d\n" ,sum);
		
*/	/*		OptionalDouble avg = stream.filter(student -> {
				return student.getGender().equals("여자");
			}).mapToInt(Student::getScore).average();	
			double a = avg.getAsDouble();
				System.out.printf("여자 평균 : %.3f\n" ,a);	
			
	*//*		int prod =	stream.filter(student -> {
					return student.getGender().equals("여자");
				}).mapToInt(Student::getScore).reduce(1, (n1,n2)-> n1*n2);	
					System.out.printf("여자 점수 곱 : %d\n" ,prod);		
	*/
		//gender 가 남자인 데이터만 모아서 List 만들기
/*		List<Student> li =
		stream.filter(student -> {return student
				.getGender().equals("남자");})
		.collect(Collectors.toList());
		System.out.printf("li:%s\n", li);
*/
		//남자인 데이터를 골라내서 이름을 key로 하고
		//전체 데이터를 value로 하는 Map 만들기
/*		Map<String, Student> map =
		stream.filter(student -> {return student
		.getGender().equals("남자");})
		.collect(Collectors.toMap(
				Student::getName, student -> student));
*/		//System.out.printf("%s\n", map);
	
		//Map의 데이터를 각 키마다 출력
		//Map은 Key를 알지 못해도 출력이 가능
		//DTO 클래스는 속성의 이름을 알아야 출력이 가능
		//DTO를 사용하면 구조 변경이 어렵다 - RDBMS
		//Map을 이용하면 구조 변경이 쉽다 - NoSQL
/*		
		Set <String> keyset = map.keySet();
		for(String key : keyset) {
			System.out.printf("%s\n", map.get(key));
		}
	*/	
		//최근에 등장한 언어들의 자신들이 만든 API의
		//결과를 Map(Dictionary)으로
		//리턴하는 경우가 많음
	/*	Map<String, List<Student>> map =
				stream.collect(Collectors.groupingBy(
						Student::getGender));
		Set <String> keyset = map.keySet();
		for(String key : keyset) {
			System.out.printf("%s:%s\n", key,map.get(key));
		}
	*/	
	 //남자와 여자 평균 점수 구하기
/*	Map<String, Double>	genderAvg =
			stream.collect(
					Collectors.groupingBy(
					Student::getGender,
					Collectors.averagingDouble(
					Student::getScore)));
	Set <String> keyset = genderAvg.keySet();
	for(String key : keyset) {
		System.out.printf("%s:%.3f\n", key,genderAvg.get(key));
	}
*/	//남자와 여자 최하 점수 구하기	
	Map<String, Optional<Student>> genderMin =
			stream.collect(
					Collectors.groupingBy(
					Student::getGender,
					Collectors.minBy(
					Comparator.comparingInt(
					Student::getScore))));
	Set <String> keyset = genderMin.keySet();
	for(String key : keyset) {
		System.out.printf("%s:%s\n", key,genderMin.get(key));
	}
	}

}
