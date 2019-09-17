package 데이터정렬ex게식판;
//여러 개의 데이터를묶어주기 위한 클래스 -DOT(VO) 클래
//Comparable 인터페이스 구현 

public abstract class FileName implements Comparable<Object>{
//속성(변수)은 private
	private String name; 
	private int size; 
	private String type;
	private boolean save;
	
	
	//변수에 접근하기 위한 접근자 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
		
		
	}
	public boolean issave() {
		return save;
	}
	public void setsave(boolean save) {
		this.save = save;
	}
	
	//디버깅을 위한 메소드
	//각 속성의 값을 빠르게 확인하기 위한 메소드
	@Override
	public String toString() {
			return "FileName [name=" +name +", size-=" + size + " , type=" + type + ", save=" + save;
	};
	public int comparaTo(Object o) {
		
		
		//숫자 데이터는 뺄셈을 이용해서 크기 비교 가
		/*FileName other = (FileName)o;
		return this.size - other.size;
	
		*/
	FileName other = (FileName)o;
		//문자열은 뺄셈을 이용할 수 없음
		return this.name.compareTo(other.name);
		
		
		
		
		
		
		
		
		
		
	





	
	
	
	
	
	
	
	
	
	





	}
}
