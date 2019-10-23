package csv;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoLibraryMain {

	public static void main(String[] args) {
		// 파일의 내용을 문자열로 읽기 위한 스트림을 생성
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream(
								"/Users/tjoeun304/Downloads/volley2.csv")))) {
			//데이터를 저장할 리스트
			List<Player> list = new  ArrayList<>();
			//첫번째 줄은 데이터로 사용하지 않기 위해서 만듬 
			boolean flag = false;
			// 줄 단위로 읽기
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				if(flag == false) {
					flag = true;
					continue;
				}
				//한 줄 잘읽어오는지 확인
				//System.out.printf("%s\n", line);
			
				//한 줄을 읽어서 , 로 분할
				String [] ar = line.split(",");
				//한 줄의 데이터를 저장할 객체를 생성
				Player player = new Player();
				player.setName(ar[0]);
				player.setAge(Integer.parseInt(ar[1]));
				String birthday = ar[2];
				SimpleDateFormat sdf =
						new SimpleDateFormat("yyyy-mm-dd");
				Date date = sdf.parse(birthday);
				player.setBirthday(date);
				//객체를 리스트에 추가
				list.add(player);
				
			}
			for(Player player : list) {
				System.out.printf("%s\n", player);
			}
		} catch (Exception e) {
			System.out.printf("파일 읽기 예외 : %s\n", e.getMessage());

		}

	}

}
