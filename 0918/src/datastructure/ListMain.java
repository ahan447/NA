package datastructure;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열을 저장하는 Stack을 생성
		Stack<String> stack =
				new Stack<>();
		//데이터 삽입은 push
		stack.push("1색상 보정");
		stack.push("2레이어 추가");
		stack.push("3수정본");
		
		//데이터를 삭제하면서 가져오기는 pop
		//pop 대신에 peek를 사용하면 2개의 결과가 동일
		String new_data = stack.pop();
		System.out.printf("%s\n" , new_data);
		
		new_data = stack.pop();
		System.out.printf("%s\n" , new_data);

		
		
		new_data = stack.peek();
		System.out.printf("%s\n" , new_data);
		
		new_data = stack.peek();
		System.out.printf("%s\n" , new_data);

		//LinkedList는 순서대로 출력
		LinkedList <String> li =
				new LinkedList<>();
		li.add("170");
		li.add("98");
		li.add("105");
		//PriorityQueue는 크기 순서대로 출력
		PriorityQueue <String> pq = 
			new PriorityQueue<>();
		pq.add("170");
		pq.add("98");
		pq.add("105");
			
		
	for(String temp : li) {
		System.out.printf("%s\t", temp);
		}
		
	System.out.printf("\n======================\n");
	for(String temp : pq) {
		System.out.printf("%s\t", temp);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
	}

}
