package util;

import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		// java.util.Random은 랜덤한 숫자를 추출하기 위한 클래스
		
		String [] ar = 
			{"1","2","3","4","5"};
		//완전 랜덤
		Random r= new Random(20);
		System.out.printf("%s\n" , ar[r.nextInt(ar.length)]);
		System.out.printf("%s\n" , ar[r.nextInt(ar.length)]);
		System.out.printf("%s\n" , ar[r.nextInt(ar.length)]);
		System.out.printf("%s\n" , ar[r.nextInt(ar.length)]);
		

	}

}
