package lang;

public class StringMain4 {
	public static void main(String[] args) {

		// String compareTo(String other) 메소드는
		// ()안에 있는 데이터가 크면 음수(-1) 같으면 0 작으면 양수 (1)를 리턴.

		int[] ar = { 100, 78, 89, 65, 45 };
		// 선택정렬
		for (int i = 0; i < ar.length - 1; i = i + 1) {
			for (int j = i + 1; j < ar.length; j = j + 1) {
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for (int temp : ar) {
			System.out.printf("%d\n", temp);
		}
		// 위의 알고리즘을 이용해서 문자열의 정렬
		String[] names = { "김좌진", "홍범도", "안중근", "유관순", "윤봉길" };
		// 위의 문자열을 정렬 : 크기 비교는 compareTo 메소드 이용

		// 데이터 출력 - 김좌진 안중근 유관순 윤봉길 홍범도 순으로 출력
		for (String temp : names) {
			for (int i = 0; i < names.length - 1; i = i + 1) {
				for (int j = i + 1; j < names.length; j = j + 1) {
					if (names[i].compareTo(names[j]) > 0) {
						String temp2 = names[i];
						names[i] = names[j];
						names[j] = temp2;
					}
				}
			}

		}
		for (String temp2 : names) {
			System.out.printf("%s\t", temp2);
		}

		if (names[0].compareTo("가") >= 0 && names[0].compareTo("나") < 0) {
			System.out.printf("\nㄱ 으로 시작\n");
		} else {
			System.out.printf("\nㄱ 으로 시작하지않음\n");
		}
		// 한글이 어떤 자음으로 시작하는지 판단할 때는 모음의 시작 ㅏ 이고 끝은ㅣ
		// 받침이 시작은 ㅇ벗는것이고 마지막은 ㅎ.
		// 한글은 가에서 시작해서 힣 이 끝
		// ㄱ으로 시작하는 경우는 가보다 크거나 같고 나보다 작은 경우

		
		
		
		
		String msg = "GCCGGCCGAHDNCGCCGGGG";
		
		int len = msg.length();
		for(int i = 1; i < msg.length(); i=i+1) {
			"GCCGGCCGAHDNCGCCGGGG".substring(i);
			System.out.print(i);
			
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


