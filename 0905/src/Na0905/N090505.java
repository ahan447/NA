package Na0905;

public class N090505 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = {60, 20, 70, 80, 980, 756, 34};
		//a 50이상인 데이터의 개수, 합계, 평균을 구해서 출력
		
		//개수를 구할 때는 개수를 저장할 변수를 만들고 얼마부터 시작 할 지 초기값을 설정
		//대부분의 경우는 0으로 초기화하고 조건을 만족하는 경우 개수를 1증가 시키면 됨.
		
		
		int cnt = 0;		
		//합계: 합계를 저장할 변수를 생성해서 처음 가지고 있을 값으로 초기화한 후
		//조건을 만족 할 때 합계를 구할 데이터를 합계 변수에 더해주면 됩니다.
		
	int sum = 0;
		
		
		//데이터 순회
		for(int temp : ar) {
			if(temp >=50) {
				//개수 = 개수 + 1
				cnt = cnt +1;
				//합계 = 합계 + 합을 구할 데이터
				sum = sum + temp;
				
			}
		}
		
		
		System.out.printf("50이상의 수:%d\n" , cnt);
		System.out.printf("50이상의 수의 합계:%d\n" , sum);
		//평균
		//평균은 한번만 계산하면 되기 떄문에 반복문 밖에
		//평균을 구할 때는 나누기를 하기 떄문에 소수는 어떻게 할지
		//나누기 할 떄는 나누는 수가 0인지 확인
		
		if(cnt == 0) {
			System.out.printf("조건에 맞지 않음.\n");
		
		}else {
			//소수 2째자리에서 반올림해서 첫번째 자리까지만 출력
			//정수 / 정수는 결과가 정수로 나옴.
			//정수 / 정수의 결과를 소수까지 구하고자 하는 경우에는
			//하나의 정수를 실수로 강제 형 변환해서 해야함.
			double avg = (double)sum / cnt;
			System.out.printf("50이상의 수의 평균:%.1f\n" , avg);
		}
		//최대, 최소
		//최대값: 최대값을 저장할 변수를 생성하고 배열의 첫번째 데이터 또 데이터의 범위
		//중에서 아주 작은 값으로 초기화하고 배열의 데이터를 순회하면서 자신보다 더 큰 데이터를
		//만나면 그 값으로 변경하면 됨.
		
		//최대값과 최소값을 저장할 변수
		int max = ar[0];
		int min = ar[0];
		
				
		//데이터 순회
		for(int temp : ar) {
			//데이터와 최대값을 비교해서 데이터가 더 크면 최대값을 변경
			if(max < temp) {
				max = temp;
			}
			//데이터와 최소값을 비교해서 데이터가 더 작으면 최소값을 변경
			if(min > temp) {
				min = temp;
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
		
		//60에 가장 가까운 데이터를 조회
		//어떤 숫자에 가장 가까운 데이터를 조회하고자 하는 경우에는
		//숫자와의 차이를 찾고 그 차이가 최소인 데이터를 찾아야 함.
		//찾는 것은 차이의 최소를 찾는 것이 아니고
		//차이가 최소가 되는 데이터임.
		
		int mindata = ar[0]; //가장 가까운 데이터를 저장
		int minvalue = 999999999; //60과의 최소 차이를 저장
		
		for(int temp : ar) {
		
		//60과의 차이를 구하기
			int cha=0;
			if(temp >=60) {
				cha = temp - 60;
			}else {
				cha = 50 - temp;
			}
		//차이가 최소인 데이터 구하기
			if(minvalue >= cha) {
				minvalue = cha;
				//차이가 최소인 데이터를 만나면 그 데이터를 저장
				mindata= temp;
				
			}}
		//60에 가장 가까운 값 출력
			System.out.printf("60에 가장 가까운 데이터 :  %d 차이 : %d\n", mindata, minvalue);
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
