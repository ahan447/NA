package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dao.BuyDao;
import domain.Buy;
import sevrice.BuyEventHandler;

public class Buyview extends JFrame {
	public JTextField txtItemName, txtCustomerid, txtCount, txtBuydate;
	public JLabel lblItemName, lblCustomerid, lblCount, lblBuydate;
	//데이터 조회를 위한 컴포넌트
	public JButton  btnLast, btnPrev, btnNext, btnFirst;
	public JLabel lblNum;
	//데이터 작업을 수행할 컴포넌트
	public JButton btnInsert, btnDelete, btnUpdate, btnSearch, btnClear;
	
	//데이터를 저장할 변수를 선언
	public List<Buy> list;
	
	//현재 보여지는 데이터의 인덱스를 저장할 변수
	public int idx ;
	
	
	public Buyview() {
		//4줄 2칸으로 만들고 여백을 가로 3 세로 3으로 설정
		JPanel p1 = new JPanel(new GridLayout(4,2,3,3));
		lblItemName = new JLabel("아이템이름",JLabel.RIGHT);
		txtItemName = new JTextField();
		lblCount = new JLabel("구매수량",JLabel.RIGHT);
		txtCount = new JTextField();
	
		
		lblCustomerid = new JLabel("구매자아이디",JLabel.RIGHT);
		txtCustomerid = new JTextField();
		lblBuydate = new JLabel("구매날짜",JLabel.RIGHT);
		txtBuydate = new JTextField();
		txtBuydate.setEditable(false);
		
		
			p1.add(lblItemName);
			p1.add(txtItemName);
			p1.add(lblCustomerid);
			p1.add(txtCustomerid);
			p1.add(lblCount);
			p1.add(txtCount);
			p1.add(lblBuydate);
			p1.add(txtBuydate);
			
			
			JPanel centerPanel = new JPanel();
			centerPanel.setLayout(new BorderLayout());
			centerPanel.add("Center", p1);
			
			btnNext = new JButton("다음");
			btnPrev = new JButton("이전");
			btnFirst = new JButton("처음");
			btnLast = new JButton("끝");
			
			BuyEventHandler eventHandler =
					new BuyEventHandler(this);
			btnNext.addActionListener(eventHandler);
			btnPrev.addActionListener(eventHandler);
			btnFirst.addActionListener(eventHandler);
			btnLast.addActionListener(eventHandler);
			
			
			lblNum = new JLabel("",JLabel.CENTER);
			
			JPanel p2 = new JPanel();
			p2.setLayout(new GridLayout(1,5,3,3));
			p2.add(btnFirst);
			p2.add(btnPrev);
			p2.add(lblNum);
			p2.add(btnNext);
			p2.add(btnLast);
			
			centerPanel.add("South",p2);
			
			add(centerPanel);
			
			btnInsert = new JButton("삽입");
			btnDelete = new JButton("삭제");
			btnUpdate = new JButton("수정");
			btnSearch = new JButton("조회");
			btnClear = new JButton("지움");
			
			btnInsert.addActionListener(eventHandler);
			btnDelete.addActionListener(eventHandler);
			btnUpdate.addActionListener(eventHandler);
			btnSearch.addActionListener(eventHandler);
			btnClear.addActionListener(eventHandler);
			
			JPanel southPanel = new JPanel();
			southPanel.setLayout(
					new GridLayout(1,5,3,3));
			southPanel.add(btnInsert);
			southPanel.add(btnDelete);
			southPanel.add(btnUpdate);
			southPanel.add(btnSearch);
			southPanel.add(btnClear);
			
			add("South", southPanel);
			
		//데이터를 출력하는 메소드
		display();
		
		setTitle("구매");
		//위치와 크기를 한꺼버넹 설정
		setBounds(200,200,500,200);
		//종료 기능 부여
		setDefaultCloseOperation(
				EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		//전체 데이터 가져와서 list에 저
		BuyDao dao = new BuyDao();
		list = dao.getList();	
	}
		//list에서 idx번째 데이터를 가져오기
		//화면에 출력하는 메소드
		public void display() {
			//배열이나 List에서 데이터를 꺼낼 때
			//ArrayIndexOutOfBoundsException에 주의
			if(list == null || list.size() == 0) {
			JOptionPane.showMessageDialog(null, "출력할 데이터가 없음");
			return;
			}
			Buy buy = list.get(idx);
			this.txtItemName.setText(buy.getItemname());
			this.txtCustomerid.setText(buy.getCustomerid());
			//숫자나 날짜는 문자열로 변환해서 출력
			String disp = String.format("%d개", buy.getCount());
			this.txtCount.setText(disp);
			this.txtBuydate.setText(buy.getBuydate().toString());
			this.lblNum.setText((idx+1)+"");
		}
		
}















