package java1010userOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserOraclemine {

	public static void main(String[] args) {
		//데이터베이스 드라이버 클래스 로드
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//데이터베이스 연결
		Connection con =
				DriverManager.getConnection(
						"jdbc:oracle:thin:@192.168.0.13:1521:xe",
						"user09","user09");
		// con.setAutoCommit(false)
		
		/*Statement stmt = 
				con.createStatement();
		int r = stmt.executeUpdate("insert into dept(deptno, dname, loc) values(99, '비서', '서울')");
		//삽일 일 때는 0이 리턴되면 실패
		if(r>0) {
			System.out.printf("삽입성공\n");
		}else {
			System.out.printf("삽입실패\n");
		}
		stmt.close();
		
		System.out.print("데이터 베이스 연결 성공\n");
		*/
		/*
		 Statement stmt = 
				con.createStatement();
		int r = stmt.executeUpdate("update dept set loc = '종로' where deptno = 10");
		if(r>0) {
			System.out.printf("수정성공\n");
		}else {
			System.out.printf("10번이 없음\n");
		}
			stmt.close();
		*/
		Statement stmt = 
				con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from dept where lower(loc) = 'dallas'");
		while(rs.next()) {
			int deptno = rs.getInt(1);
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.printf("부서번호 : %d 부서번호 : %s 지역 : %s\n", deptno, dname, loc);
		}
		rs.close();
		stmt.close();
		
					
		con.close();
		
	}catch(Exception e){
		System.out.println(e.getMessage());
		e.printStackTrace();

	}

}
}
