package java1022stream;

public class Student {


		private int num;
		private String name;
		private String gender;
		private int score;
		
		
		//Default Constructor - 매개변수가 없는 생성자
		//new 했을 때 Default Constructor
		//가 없다는 에러 메시지가 보이면
		//이 클래스는 매개변수가 없는 생성자가 없는 것이므로
		//매개변수를 대입해서 객체를 생성해야 함
		
		//어떤 클래스를 상속받았는데 동일한 메시지가 보이면
		//생성자를 만들어서 상위 클래스의 생성자(super())를
		//반드시 호출해야 함 - 안드로이드에서 많이 발생
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		//모든 속성의 값을 매개변수로 받아서 객체를 생성하는
		//생성자 - set을 호출하지 않고 객체의 속성 값들을
		//한번에 채울 수 있음
		public Student(int num, String name,String gender ,  int score) {
			super();
			this.num = num;
			this.name = name;
			this.gender = gender;
			this.score = score;
		}
		//접근자 메소드
		//속성이 private 이라서 외부에서 접근을 못하기
		//때문에 public 으로 접근자 메소드를 만들어서
		//접근하기 위해서 생성 - 가장 일반적인 목적
		//swift 나 kotlim 으 작업은 자동s

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}

		@Override
		public String toString() {
			return "Student [num=" + num + ", name=" + name + ", gender=" + gender + ", score=" + score + "]";
		}
		
}
