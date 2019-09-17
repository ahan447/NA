package 데이터정렬ex게식판;

import java.util.LinkedList;
import java.util.List;

public class ListMain3 {

	public static void main(String[] args) {
		//Board 클래스의 객체 여러개를 저장 할 수 있는 자료구조를 생성
		//배열(크기 변경 안됨), ArrayList(읽기는 빠름), LinkedList(삭입삭제가 빠름)
		List<Board> list =
				new LinkedList<>();
		//Board 클래스의 객체를 만들어서 데이터를 설정한 후 list에 삽입하기
		//이 부분은 데이터베이스에 읽어오던가 파일에서 읽어오는 형태로 변경
		
		Board board = new Board();
		board.setNum(1);
		board.setTitle("이번 이벤 벌써 오류");
		board.setWriter("군계");
		board.setRegdate("2019-09-17");
		
		list.add(board);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
