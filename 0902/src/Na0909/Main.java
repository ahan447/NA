package Na0909;

public class Main {

	public static void main(String[] args) {
		//student 클래스의 instance 생성
		Student Student1 = new Student();
		//속성에 set 메소드를 이용해서 값을 설정
		//Student1.setHakbun("11-70009654");
		Student1.setName("양");
		Student1.setGender(true);
		Student1.setMobile("0107345");
		
		//get 메소드를 이용해서 값을 가져와서 출력
		System.out.printf("학번:%s\n", Student1.getHakbun());
		//student1의 no 값 출력
		System.out.printf("번호:%d\n" , Student1.getNo());
		Student Student2 = new Student();
		//student2의 no 값 출력
		System.out.printf("번호:%d\n" , Student2.getNo());
		
		
		//매개변수가 있는 생성자를 호출해서 초기화
		Student Student3 = new Student("090909", "양씨", true, "0104299");
		//set 메소드를 호출하지 않고 속성을 초기화
		
		System.out.printf("번호:%d\n학번:%s\n이름:%s\n번호:%s\n" , Student3.getNo() ,Student3.getHakbun(), Student3.getName(),Student3.getMobile() );
		
		
		
	}

}
