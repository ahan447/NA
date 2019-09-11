package Na0905;

public class N090504 {

	public static void main(String[] args) {
		// 2행 3열 짜리 배열을 데이터를 대입한 상태에서 생성
		String[][] AAA = { { "양씨", "김씨", "주씨", "손씨" }, { "박씨", "서씨", "신씨", "조씨" } };
		// 2차원 배열의 모든 데이터를 접근
		// 2개의 반복문을 이용
		for (int A = 0; A < 2; A = A + 1) {
			for (int AA = 0; AA < 3; AA = AA + 1) {
				System.out.printf("%s\n", AAA[A][AA]);
			}
		}

		// 위의 반복문을 하나의 반복문으로처리
		// 행인덱스는 열의 개수일 떄마다 변경 : 특정한 개수만큼 진행한 후 변경되는 작업은 몫을 이용해서 가능
		// 열인덱스는 0부터 열인덱스 -1 까지의 순서대로 반복
		// 일정한 범위 내의 데이터를 순서대로 하도록 할 때는 나머지를 이용
		System.out.print("==============================\n");

		for (int i = 0; i < 6; i = i + 1) {
			System.out.println(AAA[i / 3][i % 3]);
		}
		System.out.print("==============================\n");
		// 이차원 배열이 빠른 열거를 이용해서 접근하는 경우 2번 해야 합니다.
		//한한 할 때마다 배열이 하나씩 벗겨짐.
		for(String [] imsi : AAA) {
			for(String temp : imsi) {
				System.out.printf("%s\n", temp);
			}
		}
	
	}

}
