package java1021Stream;

public class Student implements Comparable<Object>{
	private int num;
	private String gender;
	private String name;
	private int score;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int num, String name, String gender, int score) {
		super();
		this.num = num;
		this.name = name;
		this.gender = gender;
		this.score = score;
	}
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
	@Override
	public int compareTo(Object o) {
	//매개변수는 자산의 자료형으로 형 변환해서 사용
	Student other = (Student)o;
	
	
	//return this.score - other.score;
	return this.name.compareTo(other.name);
	}
	
	
	
}