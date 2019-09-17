package 데이터정렬ex게식판;

import java.util.Arrays;

public class ArraysMain2 {

	public static void main(String[] args) {
		//Filename 의 배열을 생성
		FileName f1 = new FileName();
		f1.setName("자바");
		f1.setSize(80);
		f1.setType("파워포인트");

		FileName f2 = new FileName();
		f2.setName("스위프트");
		f2.setSize(190);
		f2.setType("키노트");
		f2.setsave(true);

		FileName f3 = new FileName();
		f3.setName("코틀린");
		f3.setSize(50);
		f3.setType("파워포인트");
		f3.setsave(false);
		
		
		//위에서 만든 FileName 객체 3개를 가지고 배열을 생
	    FileName [] ar = {f1,f2,f3};
		
		
		//배열의 데이터를 확인
		for(FileName temp: ar) {
			//객체 이름을 %s에 맹핑 시켜서 출력하면 toString()의 결과가 출력
			System.out.printf("%s\n", temp);
		}
		
		
		//배열의 데이터 정령
		//데이터를 정렬할려면 크기 비교하는 메소드가 구현되어 있어야 함.
		//COmparable 인터페이스의 compareTo 메소드
		//아니면 comparator 인터페이스를 구현한 객체를 대입을 해주어야 함.
		Arrays.sort(ar);
		System.out.printf("========================\n");
		
		//배열의 데이터를 확인
		for(FileName temp: ar) {
			//객체 이름을 %s에 맹핑 시켜서 출력하면 toString()의 결과가 출력
			System.out.printf("%s\n", temp);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}


