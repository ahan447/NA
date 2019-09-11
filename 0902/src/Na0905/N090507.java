package Na0905;

import java.util.Scanner;

public class N090507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)	;
		System.out.printf("피보나치의 몇번째를?:");
		int su = sc.nextInt();
		
		//구할 수열의 2번째 이전 데이터를 저정할 변수	
		int n1 = 1;
		//구할 수열의 1번째 이전 데이터를 저정할 변수
		int n2 = 1;
		//피보나치 수열의 값을 저장할 변수
		int fibo = 1;
		for(int i=3; i<=su; i=i+1) {
			fibo = n1 + n2;
			
			n1 = n2;
			n2 = fibo;
		}
		
		
		System.out.printf("%d번째 피보나치 수열의 값:%d\n",su,fibo);
		
	sc.close();
	}

}
