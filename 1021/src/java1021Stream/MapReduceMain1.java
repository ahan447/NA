package java1021Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class MapReduceMain1 {

	public static void main(String[] args) {
		Student [] students =  {
				new Student(1, "아이린" , "여자", 90),
				new Student(2, "김효임" , "여자", 97),
				new Student(3, "이영은" , "여자", 90),
				new Student(4, "연우" , "여자", 95),
				new Student(5, "신예은" , "여자", 89) };
		//배열을 스트림으로 생성
		Stream <Student> stream =
				Arrays.stream(students);
		
		//Map-Reduce Programming
/*		stream.filter((Student student) ->{
			return student.getGender().equals("여자");
		}).forEach((Student student) ->{
			System.out.println(student);
		});
		
*/		
		stream.filter(student ->{
			return student.getGender().equals("여자");
		}).forEach(student ->{
			System.out.println(student);
		});
		
	}

}
