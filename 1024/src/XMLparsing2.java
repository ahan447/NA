import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLparsing2 {

	public static void main(String[] args) {
		//다운로드 받은 문자열을 저장할 변수
		String xml = "";
		try {
			//다운로드 받을 주소 생성
			//한글이 포함된 경우는 한글은 인코딩해야 함
			//URLEncoder.encode(한글, "utf8")
			String addr =
					"http://www.weather.go.kr/weather/forecast/mid-term-xml.jsp?stnld=109"; 
			//주소만들기
			URL url = new URL(addr);
			//연결하기
			HttpURLConnection con =
					(HttpURLConnection)
					url.openConnection();
			con.setConnectTimeout(30000);
			//데이터 읽기
			BufferedReader br =
					new BufferedReader(
							new InputStreamReader(
									con.getInputStream()));
			
			StringBuilder sb =
					new StringBuilder();
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				sb.append(line + "\n");
			}
			xml = sb.toString();
			br.close();
			con.disconnect();
			//System.out.printf("%s\n" , xml);
			
		} catch (Exception e) {
			System.out.printf("다운로드 예외 : %s\n" , e.getMessage());
			
		}
		try {
			//파싱을 수행할 객체 생성
			DocumentBuilderFactory factory =
					DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder =
					factory.newDocumentBuilder();
			//파싱을 수행항 데이터 만들기
			InputStream is =
					new ByteArrayInputStream(
							xml.getBytes());
			//메모리에 전부 펼치기
			Document document =
					documentBuilder.parse(is);
			//루트 찾기
			Element element =
					document.getDocumentElement();
			//city 태그의 내용을 찾아서
			//List에 저장
			List<String>cities =
					new ArrayList<>();
 			//city 태그 전부 가져오기
			NodeList cityList =
					element.getElementsByTagName("city");
			for(int i=0; i<cityList.getLength();i=i+1) {
				Node item = cityList.item(i);
				Node city = item.getFirstChild();
				cities.add(city.getNodeValue());
			}
			//System.out.printf("%s\n" , cities);
			
			//날짜를 가져와서 전부 저장하기
			List<String> dateList =
					new ArrayList<>();
			//tmEf 태그의 값 가져오기
			NodeList tmEf =
					element.getElementsByTagName("tmEf");
			for(int i=0; i<tmEf.getLength();i=i+1) {
				Node item = tmEf.item(i);
				Node t = item.getFirstChild();
				dateList.add(t.getNodeValue());
			}
			//System.out.printf("%s\n", dateList);
			
			//wf 태그의 값 저장하기
			List<String>weatherList=
					new ArrayList<>();
			NodeList wfList =
					element.getElementsByTagName("wf");
			for(int i=0;i<wfList.getLength();i=i+1) {
				if(i==0) {
					continue;
				}
				Node item = wfList.item(i);
				Node wf = item.getFirstChild();
				weatherList.add(wf.getNodeValue());
				
			}
			//System.out.printf("%s\n", weatherList);
			int i = 0;
			for(String city : cities) {
				System.out.printf("%s\n", city);
				for(int j=0; j<6;j=j+1) {
					System.out.printf("\t%s:%s\n",dateList.get(i*6+j),weatherList.get(i*6+j));
				}
			}
			
			
			
		} catch (Exception e) {
			System.out.printf("XML 파싱 예외 : %s\n" , e.getMessage());
		}
		
	}
	
}