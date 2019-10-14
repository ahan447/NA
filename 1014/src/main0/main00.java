package main0;

import dao.BuyDao;

public class main00 {

	public static void main(String[] args) {
		BuyDao dao = new BuyDao();

/*
		Buy buy = new Buy();
		buy.setBuycode(1);
		buy.setItemname("사과");
		buy.setCustomerid("Neo");
		buy.setCount(5);
		
		int r = dao.insertBuy(buy);
		
*/
		
		
	/*	
		int r =dao.deleteBuy(1);
		
		
		if(r > 0) {
			System.out.printf("삭제 성공\n");
		}else {
			System.out.printf("삭제 실패\n");
		}
	
	*/
		
	System.out.printf("%s\n", dao.getBuy(4));
}
}
