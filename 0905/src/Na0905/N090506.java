package Na0905;

public class N090506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = {98, 45, 66, 42, 50, 77,85};
		//데이터의 개수 저장
		int len = ar.length;
		//데이터의 개수가 n 이라면 n-1번 수
		for(int i=0; i<len-1; i=i+1) {
		//회전수 +1 번째부터 마지막 데이터 까지 비교
			for(int j=i+1; j < len; j= j+1) {
				//앞의 데이터가 뒤의 데이터보다크다면 swap
				
				//갈호 부호만 바꾸면 내림차순 오름차순을 바꿀수 있음.
				if(ar[i] > ar[j] ){
					int temp = ar[i];
					ar[i]= ar[j];
					ar[j] = temp;
				}
			}
		}
		//데이터 출력
		for(int temp : ar) {
		System.out.printf("%d\t", temp);}
		System.out.printf("\n");
		
		//최대 n-1 회전 0-3
		int aaaa= 0;
		for(int i=0; i<len-1; i=i+1){
			//데이터 교체가 있었는지 확인할변수 하나 넣기
			int flag = 0;
			
			//첫번째부터 마지막 데이터 이전까지
			for(int j=0; j<len-1-i; j=j+1) {
				//자신의 뒤의 데이터와 비교해서 정렬
				if(ar[j] > ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
					//데이터 교체가 있었다는 것을 표시
					flag=1;
					aaaa=aaaa+1;
				}
			}
			//1회전동안 데이터 교체가 없었으면 비교 종료
			if(flag == 0) {
				break;
			}
		}
		for(int temp : ar) {
			System.out.printf("%d\t", temp);}
		System.out.printf("aaaa:", aaaa);
		
		
	}

}
