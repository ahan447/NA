package com.gmail.ahan447.domian;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

public class MemberDaoImpl implements MemberDao {
	//싱글톤 패턴 구현을 위한 코드
private MemberDaoImpl() {}
	
	private static MemberDao memberDao;
	
	public static MemberDao getInstance()
	{
		if(memberDao == null)
		{
			memberDao = new MemberDaoImpl();
		}
		return memberDao;
	}
	
	//클래스를 처음 사용할 때 1번만 호출되서 수행하는 부분
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e)
		{
			System.out.printf("클래스 로드 예외 : %d\n",e.getMessage() );
			e.printStackTrace();
		}
		
	}
	
	//여러 
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	@Override
	public String idCheck(String id) {
		String result = null;
		//null이 리턴되면 아이디가 없는 것이고
		//null이 아닌 데이터가 리턴되면 아이디가 존
		try
		{
			con = DriverManager.getConnection("jdbc:mysql://192.168.0.151:3306/"
					+ "user09?useUnicode=true&characterEncoding=utf8",
					"user09","user09");
			pstmt = con.prepareStatement("select id from member where id = ?");
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			//결과 사용 - 하나의 행이 리턴되는 경우
			if(rs.next())
			{
				result = rs.getString("id");
			}
			
			rs.close();
			pstmt.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.printf("아이디 중복 체크 예외 : %s\n", e.getMessage());
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int insertMember(Member member) {
		int result = -1;
		
		try
		{
			con = DriverManager.getConnection("jdbc:mysql://192.168.0.151:3306/"
					+ "user09?useUnicode=true&characterEncoding=utf8",
					"user09","user09");
			pstmt = con.prepareStatement("insert into member(id,pw,name,alias,regdate) values(?,?,?,?,?)");
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getAlias());
			pstmt.setDate(5, member.getRegdate());
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.printf("회원 가입 예외 : %s\n", e.getMessage());
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public Member login(Map<String, Object> map) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e)
		{
			System.out.printf("클래스 로드 예외 : %d\n",e.getMessage() );
			e.printStackTrace();
		}
		
	}

	
	@Override
	public String idCheck(String id) {
		String result = null;
		//null이 리턴되면 아이디가 없는 것이고
		//null이 아닌 데이터가 리턴되면 아이디가 존
		try
		{
			con = DriverManager.getConnection("jdbc:mysql://192.168.0.151:3306/"
					+ "user09?useUnicode=true&characterEncoding=utf8",
					"user09","user09");
			pstmt = con.prepareStatement("select id from member where id = ?");
			pstmt.setString(1, (String)map.get("id"));
			pstmt.setString(2, (String)map.get("pw"));
			
			
			
			rs = pstmt.executeQuery();
			//결과 사용 - 하나의 행이 리턴되는 경우
			if(rs.next())
			{	
				member = new Member();
				member.setId(rs.getString("id"));
				member.setAlias(rs.getString("alias"));
			}
			
			rs.close();
			pstmt.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.printf("아이디 중복 체크 예외 : %s\n", e.getMessage());
			e.printStackTrace();
		}
		
		
		return null;
		
		
	}

}