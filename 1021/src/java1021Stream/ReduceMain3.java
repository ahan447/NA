package java1021Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ReduceMain3 {

	public static void main(String[] args) {
	//	String [] ar =
	//		{"C&C++" , "Java","C#","JavaScript" ,"Oython","R","Kotlin",
	//				"Swift","SQL","Haskell","Closure","Scaka","Ruby","Php"
	//				
	//		};
		//배열을 가지고 스트림을 생성
		
	//Stream <String> stream =
	//		Arrays.stream(ar);
	//String 클래스는 Comparable 인터페이스를
	//implements 해서 정렬이 가능
	
/*	stream.forEach(
			lang ->System.out.println(lang)
			);
*/
	//sort 사용해서 정렬
/*	stream.sorted().forEach(
			lang ->System.out.println(lang)
			);
*/	//내림차순 정렬
/*	stream.sorted(Comparator.reverseOrder()).forEach(
			lang ->System.out.println(lang)
			);
*/
	//Student의 배열을 생성
	Student [] students =  {
			new Student(1, "아이린" , "여자", 90),
			new Student(2, "김효임" , "여자", 97),
			new Student(3, "이영은" , "여자", 90),
			new Student(4, "연우" , "여자", 95),
			new Student(5, "신예은" , "여자", 89) };
	//배열을 스트림으로 생성
	Stream <Student> st =
			Arrays.stream(students);
	//st.sorted(Comparator.reverseOrder()).forEach(
	//		student ->
	//		System.out.println(student));		
		//Comparator 인터페이스를 이용한 정렬
		//score의 내림차순 정렬
		//.reversed()를 생략하면 오름차순
		//score 가 같으면 이름의 오름차순
	/*
		st.sorted(Comparator.comparing(
				Student::getScore).reversed()
				.thenComparing(Student::getName))
		.forEach(student ->System.out.println(student));
	*/
	//Comparator 객체 직접 생성
	Comparator<Student> comp =
			new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
			if(o1.getScore() > o2.getScore()) {
				return 1;
			}else if(o1.getScore() == o2.getScore()) {
				return o1.getName().compareTo(o2.getName());
				}else {
					return -1;
				}
		
	};
	};
	st.sorted(comp).forEach(
			student -> System.out.println(student));
			
	
	
	}

}
