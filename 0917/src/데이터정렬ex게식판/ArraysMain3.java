package 데이터정렬ex게식판;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArraysMain3 {

	public static void main(String[] args) {
			//Filename 의 배열을 생성
			FileName f1 = new FileName();
			f1.setName("자바");
			f1.setSize(80);
			f1.setType("파워포인트");
			f1.setsave(true);

			FileName f2 = new FileName();
			f2.setName("스위프트");
			f2.setSize(190);
			f2.setType("키노트나");
			f2.setsave(true);

			FileName f3 = new FileName();
			f3.setName("코틀린");
			f3.setSize(50);
			f3.setType("파워포인트");
			f3.setsave(false);
			
			
			//위에서 만든 FileName 객체 3개를 가지고 배열을 생성
			FileName [] ar = {f1,f2,f3};
		    
			//키보드로부터 입력받기 위한 객체를 생성
			Scanner sc = new Scanner(System.in);
		    
			System.out.printf("정렬 기준을 선택하세요(1.이름 2.크기):");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				Arrays.sort(ar,new Comparator<FileName>() {
					@Override
					public int compare(FileName o1, FileName o2) {
						//o1과 o2의 name을 비교
						return o1.getName().compareTo(o2.getName());
					}
				});
			}else if(menu == 2) {
				Arrays.sort(ar, new Comparator<FileName>() {

					@Override
					public int compare(FileName o1, FileName o2) {
						return o1.getSize() - o2.getSize();
					}
					
				});
			}else {
				System.out.printf("메뉴는 1번과 2번만 선택하여야 합니다.\n");
				//프로그램종료
				System.exit(0);
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//ar 배열의 내용을 출력
			
			for(FileName Temp : ar) {
					System.out.printf("%s\n", Temp);
				}
			
			
			
			
			
			
			
			
			
			
			
			
			
			//입력받는 객체 닫기
			sc.close();
			
			
	}

}
