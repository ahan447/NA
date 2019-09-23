package eventhandling;

public class EventMain {

	public static void main(String[] args) {
		//new EventFrame();
		//new EventRouting();
		//new ItemFrame();
		new TextEventFrame();
	
	
	/*	
		//데이터의 리스트
		ArrayList<String> list =
				new ArrayList<>();
		list.add("1.낡은 검");
		list.add("2.녹이 쓴 검");
		list.add("3.양날검");
		list.add("4.양손검");
		list.add("5.한손검");
		list.add("6.단검");
		list.add("7.레이피어");
			
		
		
		//삭제할 항목의 인덱스 리스트
		ArrayList<Integer> deleteList = new ArrayList<>();
		deleteList.add(1);
		deleteList.add(3);
		deleteList.add(5);
		
		
		//리스트에서 데이터를 삭제하는 메소드 remove(int index)
		//데이터의 리스트를 가지고 인덱스를 리스트에 해당하는 데이터를 삭제
		//리스트에서 여러 개를 삭제할 때는 뒤에서붜 삭제를 하던가
		//삭제할 때마다 인덱스를 변경하던가 해야 함.
		
		
		int AAA = 0;
		for(int i : deleteList) {
			list.remove(i-AAA);
			AAA = AAA + i;
			
			System.out.printf("%d 삭제\n", i);
		}
		
		
		
		for(int i = deleteList.size()-1; i>=0; i=i-1){
			int idx = deleteList.get(i);
			list.remove(idx);
			
			
		}
		
		for(String temp : list) {
			System.out.printf("%s\n", temp);
		}
		
		
		
		//데이터의 리스트를 가지고 인덱스 리스트에 해당하는 데이터를 삭제
		
		
	*/	
	}

}
