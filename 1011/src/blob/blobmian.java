package blob;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class blobmian {

	public static void main(String[] args) {
	/*	try {
		Connection con = 
				DriverManager.getConnection
				("jdbc:oracle:thin:@192.168.0.13:1521:xe",
				"user09","user09");
		PreparedStatement pstmt = con.prepareStatement("insert into blobsample("
				+ "filename,filecontent)"
				+ "values(?,?)");
		
		
		
		
		//	PreparedStatement pstmt =
	//			con.prepareStatement(
	//					"insert into blobsample(filename, filecontent) valuse(?,?)"); 
		String filepath = "/Users/tjoeun304/Downloads/momo2.jpg";
		FileInputStream fis = 
			new FileInputStream(filepath);
		
		//파일 경로에서 이름만 가져오기
		///로 분활 한 후 가장 마지막 문자열
		String [] ar = filepath.split("/");
		String filename = ar[ar.length-1];
		System.out.println(filename);
		
		pstmt.setString(1, filename);
		//blob 바인딩
		pstmt.setBinaryStream(2, fis);
		//실행
		pstmt.executeUpdate();
		
		
		pstmt.close();
		con.close();
			
		
			
		}catch (Exception e) {
			System.out.printf(
					"blob 저장 예외:%s\n", 
					e.getMessage());
				e.printStackTrace();
		}

	*/	
		/*
		try {
			Connection con = 
					DriverManager.getConnection
					("jdbc:oracle:thin:@192.168.0.13:1521:xe",
					"user09","user09");
			PreparedStatement pstmt =
					con.prepareStatement(
							"select * from blobsample");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				//blob 가져오기
				InputStream is =
					rs.getBinaryStream("filecontent");
			//현재 디렉토리에 filename을 갖는 파일 기록 객체를 생성
				FileOutputStream fos =
						new FileOutputStream("./" + filename);
			//is의 내열을 fos에 기록
				while(true) {
					byte [] b = new byte[1024];
					//읽은 개수를 len에 저장
					int len = is.read(b);
					//읽은 데이터가 없으면 그만 읽기
					if(len <= 0) {
						break;
					}
					//읽으 내용을 fos에 기록
					fos.write(b,0,len);
				}
			
			
			fos.flush();
			fos.close();
			
			
			
			
			}
			rs.close();
			pstmt.close();
			con.close();
			
		
			
			
		}catch (Exception e) {
			System.out.printf(
					"blob 불러오기 예외:%s\n", 
					e.getMessage());
				e.printStackTrace();
		}
		
			*/
		
		try {
			Connection con = 
					DriverManager.getConnection
					("jdbc:oracle:thin:@192.168.0.13:1521:xe",
					"user09","user09");
		//프로시저를 실행할 수 있는 객체를 생성
			CallableStatement call = 
					con.prepareCall(
							"{call myproc(?,?,?)}");
			call.setInt(1, 77);
			call.setString(2, "회계");
			call.setString(3, "영월");
			
			call.executeUpdate();
			
			
			call.close();
			con.close();
		}catch (Exception e) {
			System.out.printf(
					"프로시저 실행 예외 : %s\n", 
					e.getMessage());
				e.printStackTrace();
	}

}
}
