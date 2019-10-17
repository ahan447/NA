import java.util.Scanner;

import com.gmail.ahan447.domian.MemberDaoImpl;
import com.gmail.ahan447.service.MemberService;

public class Main {

	public static void main(String[] args) {
		//1번이면 회원가입 2번이면 로그인
		//3번이면 종료를 할 수 있도록 메뉴를 구성
		Scanner sc = new Scanner(System.in);
		MemberDao dao =
				MemberDaoImpl.getInstance();
		
		MemberService service =
				new MemberServiceImpl();
		//serice 의 dao 에 여기서 만든 dao를 주입
		service.dao - dao;
		
		
		while(true) {
			System.out.printf(
		"메뉴 입력(1,회원가입 2.로그인) : ");
			String menu = sc.nextLine();
			switch(menu) {
			case "1":
				System.out.printf("회원가입\n");
				boolean x = service.insertMember(sc);
				String msg = null;
				if(x == true) { 
					msg = "회원가입 성공\n";
				}else {
					msg = "회원가입 실패\n";
				}
			System.out.printf(msg);
			break;
			case "2":
				boolean y = service.login(sc);
				if(y == true) {
					System.out.printf("로그인 성공\n");
				}else {
					System.out.printf("로그인 실패\n");
				}
				
				
					
			break;
			case "3":
				System.out.printf("프로그램 종료\n");
				sc.close();
				System.exit(0);
			break;
			default:
				System.out.printf("잘못된 메뉴 선택\n");
			break;
			}
	}
	}
/*	
		
		
		
		MemberDao dao = MemberDaoImpl.getInstance();
	//System.out.printf(
	//		"%s\n", dao.idCheck("gg");
	Map<String, Object> map =
			new HashMap<String, Object>();
	map.put("id", "gg");
	map.put("pw" , "kk");
	
	
	
	/*
	Member member = new Member();
	member.setId("neo");
	member.setPw("oen");
	member.setName("양");
	member.setAlias("은");

	
	Calendar cal =
			new GregorianCalendar();
	Date regdate =
			new Date(cal.getTimeInMillis());
	member.setRegdate(regdate);
	
	
	int r = dao.insertMember(member);
	
	
//	System.out.printf("결과:%d\n",r);
	
	//로그인을 처리할 때 id와 pw 일치하면
	//id에 해당하는 회원정보를 저장
	//일치하는 데이터가 없으면 nill을 리턴
	
	
	System.out.printf("결과:%s\n",dao.login(map));
	}
*/
}
