package datastructure;
import java.util.HashMap;
import java.util.Map;

public class MapMain1 {

	public static void main(String[] args) {
		// Map을 생성해서 데이터를 추가하고 갱신하고 삭제
		//변수는 Map으로 선언하고 new 를 할 때 실제 자료형을 결정
		//key 의 자료형은 String
		//Value의 자료형은 Object
		
		Map<String, Object> map
			= new HashMap<>();
		//{name=양씨, job=학생, age=18}
		

		//저장한 순서대로 키를 배치
		//	= new LinkedHashMap<>();
		//{name=양씨, age=18, job=학생}
		
		
		//키의 크기 순서대로 키를 배치
		//	= new TreeMap<>();
		// {age=18, job=학생, name=양씨}
		
		
		//데이터 추가 및 갱신
		//동일한 키에 데이터를 삽입하면 갱신
		map.put("name",  "양씨");
		map.put("age", 28);
		map.put("job", "학생");
		map.put("age" , 18);
		
		
		//전체 데이터 확인
		//toString을 호출해서 확인
		System.out.printf("%s\n", map);
		
		
		//Map의 데이터 삭제
		map.remove("job");
		
		System.out.printf("%s\n", map);
		
		//존재하지 않는 key를 이용하새 가져오면 null
		System.out.printf("%s\n", map.get("job"));
		
		
		
		//key에 해당하는 데이터 가져오기
		System.out.printf("%s\n", map.get("name"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	}

}
