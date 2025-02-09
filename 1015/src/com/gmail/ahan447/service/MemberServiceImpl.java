package com.gmail.ahan447.service;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.gmail.ahan447.domian.Member;
import com.gmail.ahan447.domian.MemberDao;

public class MemberServiceImpl implements MemberService {
	
	public MemberDao dao;
	// 회원 가입 서비스
	@Override
	public boolean insertMember(Scanner sc) {
		boolean result = false;
		// id, pw, name, alias를 입력받아서 데이터삽입
		while(true) {
			System.out.printf("아이디 입력:");
			String id = sc.nextLine();
			if(dao.idCheck(id) != null) {
				System.out.printf("이미 사용중인 아이디 입니다.\n");
				continue;
			}
			System.out.printf("비밀번호 입력:");
			String pw = sc.nextLine();
			System.out.printf("이름 입력:");
			String name = sc.nextLine();
			System.out.printf("별명 입력:");
			String alias = sc.nextLine();
			Calendar cal = new GregorianCalendar();
			Date regdate = new Date(cal.getTimeInMillis());
			
			Member member = new Member();
			member.setId(id);
			member.setPw(pw);
			member.setName(name);
			member.setAlias(alias);
			member.setRegdate(regdate);
			int r = dao.insertMember(member);
			if(r>0) {
				result = true;
			}
			break;
		}		
		return result;
	}

	@Override
	public boolean login(Scanner sc) {
		boolean result = false;
		System.out.printf("아이디 입력 :");
		String id = sc.nextLine();
		System.out.printf("비밀번호 입력 : ");
		String pw = sc.nextLine();
		//id 와 pw를 묶어서 Map에 저장
		Map<String, Object> map =
				new HashMap<String, Object>();
		map.put("id",id);
		map.put("pw",pw);
		//Dao 의 로그인 메소드 호출
		Member member = dao.login(map);
		
		if(member != null) {
			result = true;
		}
		return result;
	}

}