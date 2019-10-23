package csv;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONMain {

	public static void main(String[] args) {
		//웹의 문자열 가져오기
		String json = "";
		
		try {
			//다운로드 받을 주소 생성
			String addr =
					"http://swiftapi.rubypaper.co.kr:2029/hoppin/movies?version=1&page=1&count=20&genreId=&order=releaseddatease";
			URL url = new URL(addr);
			//연결 객체 생성
			HttpURLConnection con =
					(HttpURLConnection)
					url.openConnection();
			//옵션 설정
			//최대 30초 동안 연결을 시도
			con.setConnectTimeout(30000);
			//헤더 설정
			con.addRequestProperty("Authorization",
					"KakaoAK 89f27348da4d7be0007e09e64780a2ce");
			//웹에서 문자열을 읽어올 스트림 생성
			BufferedReader br =
					new BufferedReader(
							new InputStreamReader(
									con.getInputStream()));
			//문자열을 일시적으로 저장할 객체 생성
			StringBuilder sb =
					new StringBuilder();
			
			while(true){
				String line = br.readLine();
				if(line == null) {
					break;
				}
				sb.append(line + "\n");
			}
			//문자열 변수에 대입
			json = sb.toString();
			System.out.printf("%s\n", json);
			
		} catch (Exception e) {
			System.out.printf("파일 읽기 예외 : %s\n" , e.getMessage());
			e.printStackTrace();
		}
		
		try {
			JSONObject data = 
					new JSONObject(json);
			System.out.printf("%s\n",data);
			
			JSONObject hoppin =
					data.getJSONObject("hoppin");
			System.out.printf("%s\n",hoppin);
			
			JSONObject movies =
					hoppin.getJSONObject("movies");
			System.out.printf("%s\n",movies);
			
			JSONArray movie =
					movies.getJSONArray("movie");
			System.out.printf("%s\n", movie);
			
			for(int i=0; i<movie.length(); i=i+1) {
				JSONObject item =
						movie.getJSONObject(i);
				//System.out.printf("%s\n", item);
				System.out.printf("%s:%s\n", item.getString("title"),
						item.getString("ratingAverage"));
			}
			
			
		} catch (Exception e){
			System.out.printf("JSON 파싱 예외 : %s\n" , e.getMessage());
			e.printStackTrace();
		}
		
		
		/*	
		try {
		//다운로드 받은 문자열을 JSON 객체로 변환
			JSONObject data = new JSONObject(json);
			System.out.printf("%s\n", data);
			JSONArray documents =
					data.getJSONArray("documents");
			System.out.printf("%s\n", documents);
			//배열을 순회
			for(int i=0; i<documents.length(); i=i+1) {
				JSONObject  item =
						documents.getJSONObject(i);
				System.out.printf("%s\n", i);
				JSONArray authors =
						item.getJSONArray("authors");
				System.out.printf("%s\n", authors);
				
			}
		} catch (Exception e){
			System.out.printf("JSON 파싱 예외 : %s\n" , e.getMessage());
			e.printStackTrace();
		}
*/		
	}

}
