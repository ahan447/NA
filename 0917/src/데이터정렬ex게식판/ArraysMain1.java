package 데이터정렬ex게식판;

import java.util.Arrays;

public class ArraysMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = {"선동렬" , "이종범" , "조계현" , "최향남"};
		//배열의 데이터를 정렬해주는 메소드
		//Arrays.sort - String 클래스는 Comparabl을 implements
		//했으므로 정렬 가능
		Arrays.sort(names);
		//정렬이 되었는지 확인
		for(String name : names) {
			System.out.printf("%s\n",name);
			
		}
			//정수 배열도 정렬이 가능
			//정수는 int 이지만 Arrays가 볼 떄는 Integer 임.
			//정수 배열
			int [] ar = {100, 200, 78, 76, 54, 88 ,25};
			//정렬하지 않은 상태에서 binary search 수행
			//binary search는 정렬이 안된 상태에서 하면 올바른 결과를 가져오지 못함.
			int result = Arrays.binarySearch(ar,54);
			System.out.printf("result:%d\n" , result);
		//먼저 정렬을 수행하고 binary search 수행
			Arrays.sort(ar);
			int result2 = Arrays.binarySearch(ar,54);
			System.out.printf("result:%d\n" , result2);
			
	}

}
