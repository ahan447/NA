package datastructure;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//헤시셋을 생성 - 저장은 해싱을 이용
		// 중복된 데이터는 저장되지 않음
		//중복된 데이터를 저장하면 add 메소드가  false 리턴
		//해시 함수는 운영체제가 선택
		System.out.printf("hashSet\n");
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(76);
		hashSet.add(137);
		hashSet.add(54);
		hashSet.add(137);
		hashSet.add(88);
		for(Integer temp : hashSet) {
			System.out.printf("%d\t" , temp);
		}
		System.out.printf("\n\n");
		//linkedHashSet 은 저장된 순서를 기억해서
		//저장한 순서대로 데이터가 출력
		System.out.printf("linkedHashSet\n");
		Set<Integer> linkedHashSet =  
			new LinkedHashSet<>();
		linkedHashSet.add(108);
		linkedHashSet.add(7);
		linkedHashSet.add(290);
		linkedHashSet.add(32405);
		for(Integer temp : linkedHashSet) {
			System.out.printf("%d\t" , temp);
		}
		
		
		System.out.printf("\n\n");
		//TerrSet : 크기 순서대로 데이터를 추출할 수 있는 Set
		//자료구조에서 Tree 라는 말이 나오면 데이터를 저장한 후
		//정렬하는 것이 아니고 데이터를 저장할 때 Tree 구조를
		//이용해서 정렬하는 방식
		//Tree의 순회 방법을 이용해서 작은 것부터 큰 (pre order) 또는
		//저장된 순서(In order)대로 출력
		//산술 연산은 Post Order
		System.out.printf("treeSet\n");
		Set<Integer> treeSet = 
				new TreeSet<>();
		treeSet.add(109);
		treeSet.add(300);
		treeSet.add(999);
		treeSet.add(548);
		for(Integer temp : treeSet) {
			System.out.printf("%d\t" , temp);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
