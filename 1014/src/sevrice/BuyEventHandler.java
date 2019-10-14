package sevrice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.BuyDao;
import domain.Buy;
import view.Buyview;

public class BuyEventHandler implements ActionListener {
	Buyview buyview;
	
	//버튼을 누르거나 텍스트 필으데서 Enter 키를 누르때 
	//처리를 위한 메소드
	
	public BuyEventHandler(Buyview buyview) {
		super();
		//변수는 아무런 기호가 붙지 않으면
		//가까운 곳에서 만들어진 것을 사용
		//this.을 붙이면 메소드 외부에서 찾아서 사용
		//super.붙으면 상위 클래스에서찾아서 사용
		this.buyview = buyview;
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "처음":
				if(buyview.idx == 0) {
					JOptionPane.showMessageDialog(null, "첫번째 데이터");
					return;
				}
				buyview.idx = 0;
				buyview.display();
		break;
		case "이전":
			//첫번째 데이터이면 마지막으로 변경
			if(buyview.idx == 0) {
				buyview.idx = buyview.list.size()-1;
			}else {
				buyview.idx = buyview.idx-1;		
			}
			buyview.display();
		break;
		case "다음":
			if(buyview.idx == buyview.list.size()-1) {
				buyview.idx = 0;
			}else {
				buyview.idx = buyview.idx+1;		
			}
			buyview.display();

		break;
		case "끝":
			if(buyview.idx == buyview.list.size()-1) {
				JOptionPane.showMessageDialog(null, "마지막 데이터");
				return;
			}else {
			buyview.idx = buyview.list.size()-1;
			buyview.display();
			}
			break;
		case "삭제" :
			int result = JOptionPane.showConfirmDialog(null, "정말로 삭제?", "삭제",JOptionPane.YES_NO_OPTION);
			if(result == JOptionPane.YES_OPTION) {
				Buy buy = buyview.list.get(buyview.idx);
				//데이터베이스에서 삭제
				BuyDao dao = new BuyDao();
				dao.deleteBuy(buy.getBuycode());
				//메모에서 삭제
				buyview.list.remove(buyview.idx);
				//idx를 조정하고 다시출력
				buyview.idx = 0;
				buyview.display();
			}
			break;
		case "삽입" :
			
			break;
		case "수정" :
			//입력한 내용 가져오기
			Buy buy = new Buy();
			//현재 데이터의 buycode를 가져와서 설정
			buy.setBuycode(
					buyview.list.get(
							buyview.idx).getBuycode());
			String itemname = buyview.txtItemName.getText().trim();
			if(itemname.length() < 1) {
				JOptionPane.showMessageDialog(null, "아이템 이름은 필수 입력사항");
				return;
			}
			buy.setItemname(itemname);
			
			String customerid =buyview.txtCustomerid.getText().trim();
			if(customerid.length() < 1) {
				JOptionPane.showMessageDialog(null, "ID는 필수 입력사항");
				return;
			}
			buy.setCustomerid(customerid);
			
			String count = buyview.txtCount.getText().trim();
			int len = count.length();
			String imsi = "";
			//문자열에서 각각의 글자를 가져와서
			//숫자이면 imsi에 더해주고 숫자가 아니면
			//중단
			for(int i=0; i<len; i=i+1) {
			char ch = count.charAt(i);
			if(ch >= '0' && ch <= '9') {
			imsi = imsi + ch;
			}else {
			break;
			}
			}
			if(imsi.length()==0) {
				imsi = "0";
				}
			buy.setCount(Integer.parseInt(imsi));
			int r = JOptionPane.showConfirmDialog(null,
					"정말로 삭제?", "삭제",JOptionPane.YES_NO_OPTION);
			if(r == JOptionPane.YES_OPTION) {
	/*			//기존데이터를 지우고 새 데이터로 변
				buyview.list.remove(buyview.idx);
				buyview.list.add(buyview.idx, buy);
	*/			//데이터 수정
				BuyDao dao = new BuyDao();
				dao.updateBuy(buy);
				//데이터 다시 불러오기
				buyview.list = dao.getList();
				display();
				
			
			}
			break;
		case "조회" :
			
			break;
		case "지움" :
			//지움 버튼을 누르면 3개버튼 비활성화
			buyview.btnDelete.setEnabled(false);
			buyview.btnUpdate.setEnabled(false);
			buyview.btnSearch.setEnabled(false);
			buyview.txtItemName.setText("");
			buyview.txtCustomerid.setText("");
			buyview.txtCount.setText("");
			buyview.txtBuydate.setText("");
			//자신의 텍스트를 변경 - 토글 버튼으로 사용
			buyview.btnClear.setText("최소");
			
			break;
		case "최소" :
			buyview.btnDelete.setEnabled(true);
			buyview.btnUpdate.setEnabled(true);
			buyview.btnSearch.setEnabled(true);	
			buyview.btnClear.setText("지움");
			buyview.display();
			break;
			
			
			
			
			
			
			
			
			
			
			
		}

	}



	private void display() {
		// TODO Auto-generated method stub
		
	}

}
