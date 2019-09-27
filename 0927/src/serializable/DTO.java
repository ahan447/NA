package serializable;

import java.io.Serializable;

//DTO(Data Transfer Object)
//여러 개의 속성을 묶어서 표현하기 위한 클래스
//다른 말로는 VO(Variable Object)라고도 함
public class DTO implements Serializable{
	private int Num;
	private String Id;
	private String Pw;
	private String Name;
	public int getNum() {
		return Num;
	}
	public void setNum(int num) {
		Num = num;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getPw() {
		return Pw;
	}
	public void setPw(String pw) {
		Pw = pw;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "DTO [Num=" + Num + ", Id=" + Id + ", Pw=" + Pw + ", Name=" + Name + "]";
	}
	
	
	
	
}