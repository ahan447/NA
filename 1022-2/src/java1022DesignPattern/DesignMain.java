package java1022DesignPattern;

import adapter.OldSystem;
import dao.Dao;
import dao.DaoFactory;
import delegate.Button;
import delegate.OnClickListener;
import service.CustomerService;
import service.CustomerSeviceImpl;

public class DesignMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		SingleTon s1 =
				SingleTon.sharedInstance();
		SingleTon s2 =
				SingleTon.sharedInstance();
		
		System.out.printf("s1 : %d\n" , s1.hashCode());
		System.out.printf("s2 : %d\n" , s2.hashCode());
		//java.lang.Runtime 클래스
		//Runtime r = new Runtime();
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		System.out.printf("r1 : %d\n" , r1.hashCode());
		System.out.printf("r2 : %d\n" , r2.hashCode());
		
		//팩토리 메소드 패턴이 적용된 클래스의 객체 생성
		Dao dao = DaoFactory.create();
		//템플릿 메소드 패턴이 적용된 경우의 객체 생성
		//변수는 인터페이스 타입으로 만듬
		CustomerService service =
				new CustomerSeviceImpl();
		service.delete();
		
		new OldSystem().oldMethod();		
		//new NewSystem().newMethod();
		
		Button btn = new Button();
		btn.setOnClickListener(
		   new OnClickListener() {
			@Override
			public void onClick() {
				System.out.printf("버튼클릭\n");			
			}
		});
		btn.onClick();
		
	}

}
