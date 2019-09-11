package NA.java0903;

public class Qwer {

	public static void main(String[] args) {
		int [] ar = {10, 30 , 20};
		
		System.out.println(ar);
System.out.println("ar[0]:" + ar[0]);
	//참조형은 저정하고 있는 데이터를 가져올 떄 이름 이외의 무엇인가를 이용해야함.
	//overflow (양수를 저장했지만 음수로 저장됨(허용치 넘음)
	int n = (int)(2100000000 +2100000000);
	System.out.println(n);
	//underflow (음수를 저장했지만 양수로 저장됨(허용치 넘음)
	int nn = (int)(-2100000000 -2100000001);
	System.out.println(nn);
	
	double d = 0.1;
	double sum = 0.0;
	for(int i=0; i<100; i=i+1) {
		sum = sum +d;
	}
System.out.println(sum);

	String name = "양씨";
	String NIVEA ="니베아는 역시 빨간립밤";
	
	String address = "서울시";
	String phone = "010";

int age = 28;

System.out.println(NIVEA);

System.out.println(name);
System.out.println(address);
		System.out.println(phone);
				System.out.println(age);
		 	System.out.printf("이름:%5s 주소:%s 전화번호:%s 나이:%d\n", name, address,phone, age);
				
				//소수를 6째 자리까지 출력
			System.out.printf("%f\n", 8.654894645);
					//소수 2째 자리까지 출력 -3째 자리에서 반올림
		System.out.printf("%.2f\n" , 8.654894654) ;
		//정수 변수를 생성해서 초기값을 부여
		int i = 27;
		
		i++; //i값을 1증가
	System.out.printf("i:%d\n", i);
		System.out.printf("i:%d\n" , ++i);
		System.out.printf("i:%d\n" , i++);
		System.out.printf("i:%d\n" , i);
		System.out.printf("i:%d\n" , i);
		
	 
		
		
		i = 0;
		int oppo = i++ + i++;
		System.out.printf("\nopop%d\n" , oppo);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
