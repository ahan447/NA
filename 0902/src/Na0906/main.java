package Na0906;

public class main {

	public static void main(String[] args) {
		//Student 클래스의 객체 만들기
		//N클래스의 객체를 생성하고그 주소를 Student라는 변수에 대입.
		//Student Student = new Student();
		
		
		
		
		Mothod0 instance = new Mothod0();
		instance.add(10, 20);
		instance.add(20.8, 22.3);
		
		instance.sum(10,20,50,64);
		instance.sum(1,2,5,64);
		instance.sum(120,220,520,64);
		instance.sum(11,11,11,11);
		
		Mothod0 obj = new Mothod0(); 
		System.out.printf("%d\n", obj.fibo1(10));
		System.out.printf("%d\n", obj.fibo2(10));
		
		
		int result = instance.returnadd(300, 500);
		result = instance.returnadd(result, 100);
		System.out.printf("결과:%d\n", result);
		//결과를 리턴하는 메소드는 다른 메소드의 매개변수가 될수 있음.
		System.out.printf("결과:%d\n", 
				instance.returnadd(
						instance.returnadd(2000, 1100), 300));
		
		/*
		//student 클래스의 객체 만들
		student student = new student();
		//메소드 호출
		student.func();
		//매개변수가 없는 메소드 호출
		student.noarg();
		System.out.println();
		System.out.println();
		//매개변수가 있는 메소드 호출
		student.onearg(1);
		//student 클래스의 객체 만들기
		//student 클래스의 객체를 생성하고 그 주소를 student1 이라는 변수에대입.
		student student1 = new student();
		student student2 = new student();
		
		
		//studentName이라는 인스턴스 변수에 값을 대입.
		student1.studentName = "강찬";
		student2.studentName = "조헌";
		
		//student1.num = "10";
		//student1.phone = "010";
	
		
		
		//int a = 10;
		//a= 7;
		//final이 붙이면 읽기 전용
		//final int B = 20;
		//B = 30; >> 이게 안됨
		
		int k = 0;
		//메소드의 매개변수로 기본형 데이터를 넘겨주는 경우
		//메소드를 호출해도 데이터는 변경되지 않음.
		student.value(k);
		System.out.printf("k:%d\n", k);
		
		int [] br = {30, 40};
		//메소드의 매개면수로 기본형이 아닌 데이터를 넘겨주면
		//메소드를 호출하고 난 후 데이터가 변경될 수 있음.
		student.reference(br);
		System.out.printf("br[0]:%d\n",br[0]);
		
		
	
		
		
		
		student1.schoolName = "두봉초등학교";
		student2.schoolName = "삼학초등학교";
		
		System.out.printf("%s\n" , student1.studentName);
		System.out.printf("%s\n" , student2.studentName);
		System.out.printf("%s\n" , student1.schoolName);
		System.out.printf("%s\n" , student2.schoolName);
		
		//System.out.println();
		
		
		
		
		
		
		
		
		*/
		obj.thisMothod0();
		
		
		
		
		
		
	}

}
